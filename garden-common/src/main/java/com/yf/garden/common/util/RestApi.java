package com.yf.garden.common.util;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yf.garden.common.dto.ResponseResult;
import com.yf.garden.common.error.BaseErrorType;
import com.yf.garden.common.error.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;
import java.util.Map;

/**
 * 接口调用工具
 * @author 张继生
 */
@Component
public class RestApi {

	private static final Logger log = LoggerFactory.getLogger(RestApi.class);
	public static RestTemplate apiRestTemplate;
	
    @Autowired
    public RestApi(@Qualifier("apiRestTemplate")
                    RestTemplate apiRestTemplate) {
    	RestApi.apiRestTemplate = apiRestTemplate;
    }
    
    /**
     * 执行HTTP DELETE请求，请求参数在url中
     *
     * @param requestUrl 请求地址
     * @param params     调用接口需要的参数
     * @return 返回响应对象
     * @throws Exception 异常
     */
	@SuppressWarnings("rawtypes")
	public static ResponseResult doDelete(String requestUrl, Object params, Object... uriVariables) throws ServiceException, JsonProcessingException {
    	log.info("请求地址：{},URI参数：{},请求参数：{}", requestUrl,uriVariables, new ObjectMapper().writeValueAsString(params));
        String fullUrl = getFullUrl(requestUrl, params);
        HttpEntity<String> requestEntity = new HttpEntity<>(null, null);
        ResponseEntity<ResponseResult> resultEntity = apiRestTemplate.exchange(fullUrl, HttpMethod.DELETE, requestEntity, ResponseResult.class,uriVariables);
        log.info("返回参数：{}",  new ObjectMapper().writeValueAsString(resultEntity.getBody()));
        return resultEntity.getBody();
    }

    /**
     * 执行HTTP PUT请求，JSON格式请求参数在请求体中
     *
     * @param requestUrl 请求地址
     * @param requestParam     调用接口参数
     * @return 返回响应对象
     */
	@SuppressWarnings("rawtypes")
    public static ResponseResult doPut(String requestUrl, Object requestParam,Object... uriVariables) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String params = objectMapper.writeValueAsString(requestParam);
        log.info("请求地址：{},URI参数：{},请求参数：{}", requestUrl,uriVariables, params);
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<String> requestEntity = new HttpEntity<String>(params, headers);
        ResponseEntity<ResponseResult> resultEntity = apiRestTemplate.exchange(requestUrl, HttpMethod.PUT, requestEntity, ResponseResult.class,uriVariables);
        log.info("返回参数：{}",  objectMapper.writeValueAsString(resultEntity.getBody()));
        return resultEntity.getBody();
    }

    /**
     * 执行HTTP POST请求，JSON格式请求参数在请求体中
     *
     * @param requestUrl 请求地址
     * @param requestParam     调用接口参数
     * @return 返回响应对象
     */
	@SuppressWarnings("rawtypes")
    public static ResponseResult doPost(String requestUrl, Object requestParam,Object... uriVariables) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String params = objectMapper.writeValueAsString(requestParam);
        log.info("请求地址：{},URI参数：{},请求参数：{}", requestUrl,uriVariables, params);
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<String> requestEntity = new HttpEntity<String>(params, headers);
        ResponseEntity<ResponseResult> resultEntity = apiRestTemplate.exchange(requestUrl, HttpMethod.POST, requestEntity, ResponseResult.class,uriVariables);
        log.info("返回参数：{}",  objectMapper.writeValueAsString(resultEntity.getBody()));
        return resultEntity.getBody();
    }

    /**
     * 执行HTTP GET请求。
     * @param requestUrl 请求地址
     * @param params     调用接口需要的参数
     * @return 返回响应对象
     * @throws Exception 异常
     */
	@SuppressWarnings("rawtypes")
    public static ResponseResult doGet(String requestUrl, Object params,Object... uriVariables) throws ServiceException, JsonProcessingException {
    	log.info("请求地址：{},URI参数：{},请求参数：{}", requestUrl,uriVariables, new ObjectMapper().writeValueAsString(params));
        String fullUrl = getFullUrl(requestUrl, params);
        ResponseEntity<ResponseResult> resultEntity = apiRestTemplate.getForEntity(fullUrl, ResponseResult.class,uriVariables);
        log.info("返回参数：{}",  new ObjectMapper().writeValueAsString(resultEntity.getBody()));
        return resultEntity.getBody();
    }
    

    /**
     * 获取完整请求URL
     * @param requestUrl 请求路径
     * @param param     请求参数
     * @return 完整URL
     * @throws Exception 异常
     */
    private static String getFullUrl(String requestUrl, Object param) throws ServiceException, JsonProcessingException {
        if(param == null){
            return requestUrl;
        }
        StringBuffer urlStringBuffer = new StringBuffer(requestUrl);
        Map<?,?> params = JacksonUtil.json2Map(new ObjectMapper().writeValueAsString(param));
        try {
            if (params != null && !params.isEmpty()) {
                urlStringBuffer.append("?");
                Iterator<?> iterator = params.keySet().iterator();
                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    if(params.get(key) != null && !params.get(key).toString().equals("null")){
                        urlStringBuffer.append(key);
                        urlStringBuffer.append("=");
                        urlStringBuffer.append(String.valueOf(params.get(key)));
                        urlStringBuffer.append("&");
                    }
                }
                urlStringBuffer.deleteCharAt(urlStringBuffer.length()-1);
            }
        } catch (Exception e) {
            throw new ServiceException(BaseErrorType.SYSTEM_PARAMETER_ERROR_ERROR);
        }

        return urlStringBuffer.toString();
    }

    /**
     * 设置并获取HTTP请求头（适用于请求参数是json格式数据）
     */
    private static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        return headers;
    }
    
    @SuppressWarnings("unchecked")
	public static <T> T getEntity(ResponseResult<?> resultEntity){
    	if("0".equals(resultEntity.getStatus())){
    		return (T) resultEntity.getData();
    	}else{
    		throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR,resultEntity.getMsg());
    	}
    }
    
    /**
     * 执行HTTP DELETE请求，请求参数在url中
     *
     * @param requestUrl 请求地址
     * @param params     调用接口需要的参数
     * @return 返回响应对象
     * @throws Exception 异常
     */
	public static <T> T doDeleteForEntity(String requestUrl, Object params,Object... uriVariables) throws ServiceException, JsonProcessingException {
        ResponseResult<?> resultEntity=doDelete(requestUrl, params, uriVariables);
    	return getEntity(resultEntity);
    }

    /**
     * 执行HTTP PUT请求，JSON格式请求参数在请求体中
     *
     * @param requestUrl 请求地址
     * @param params     调用接口参数
     * @return 返回响应对象
     */
	public static <T> T doPutForEntity(String requestUrl, Object params,Object... uriVariables) throws ServiceException, JsonProcessingException {
        ResponseResult<?> resultEntity=doPut(requestUrl, params, uriVariables);
    	return getEntity(resultEntity);
    }

    /**
     * 执行HTTP POST请求，JSON格式请求参数在请求体中
     *
     * @param requestUrl 请求地址
     * @param params     调用接口参数
     * @return 返回响应对象
     */
	public static <T> T doPostForEntity(String requestUrl, Object params,Object... uriVariables) throws ServiceException, JsonProcessingException {
        ResponseResult<?> resultEntity=doPost(requestUrl, params, uriVariables);
    	return getEntity(resultEntity);
    }

    /**
     * 执行HTTP GET请求。
     *
     * @param requestUrl 请求地址
     * @param params     调用接口需要的参数
     * @return 返回响应对象
     * @throws Exception 异常
     */
    public static <T> T doGetForEntity(String requestUrl, Object params,Object... uriVariables) throws ServiceException, JsonProcessingException {
        ResponseResult<?> resultEntity=doGet(requestUrl, params, uriVariables);
    	return getEntity(resultEntity);
    }

}
