//package com.example.zuul.filter;
//
//import com.example.zuul.model.AbTestingRoute;
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.apache.http.Header;
//import org.apache.http.HttpHost;
//import org.apache.http.HttpRequest;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpPatch;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.client.methods.HttpPut;
//import org.apache.http.entity.ContentType;
//import org.apache.http.entity.InputStreamEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.message.BasicHeader;
//import org.apache.http.message.BasicHttpRequest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.netflix.zuul.filters.ProxyRequestHelper;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.client.RestTemplate;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.Random;
//
///**
// * 创建者 bee
// * 类名称
// * 类说明
// * 创建时间 2019/5/9
// */
//@Component
//public class SpecialRoutesFilter extends ZuulFilter {
//    private static final int FILTER_ORDER = 1;
//    private static final boolean SHOULD_FILTER = true;
//    @Autowired
//    FilterUtils filterUtils;
//    @Autowired
//    RestTemplate restTemplate;
//
//    private ProxyRequestHelper helper = new ProxyRequestHelper();
//
//    @Override
//    public String filterType() {
//        return FilterUtils.ROUTE_FILTER_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        return FILTER_ORDER;
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return SHOULD_FILTER;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        RequestContext requestContext = RequestContext.getCurrentContext();
//        System.out.println(requestContext.toString());
////        AbTestingRoute abTestingRoute=getAbTestingRoute(filterUtils.getCorrelationId());
//        String test = getURL("1");
//        if (test != null && useSpecialRoute(test)) {
//            String route =
//                    buildRouteString(
//                            String.valueOf(requestContext.getRequest().getRequestURL()),
//                            "http://localhost:8091",
//                            "/restTemplate/1");
//            forwardToSpecialRoute(route);
//        }
//        return null;
//    }
//
//    private void forwardToSpecialRoute(String route) {
//        RequestContext context = RequestContext.getCurrentContext();
//        HttpServletRequest request = context.getRequest();
//
//        MultiValueMap<String, String> headers = this.helper
//                .buildZuulRequestHeaders(request);
//        MultiValueMap<String, String> params = this.helper
//                .buildZuulRequestQueryParams(request);
//        String verb = getVerb(request);
//        InputStream requestEntity = getRequestBody(request);
//        if (request.getContentLength() < 0) {
//            context.setChunkedRequestBody();
//        }
//
//        this.helper.addIgnoredHeaders();
//        CloseableHttpClient httpClient = null;
//        HttpResponse response = null;
//
//        try {
//            httpClient = HttpClients.createDefault();
//            response = forward(httpClient, verb, route, request, headers,
//                    params, requestEntity);
//            setResponse(response);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//
//        } finally {
//            try {
//                httpClient.close();
//            } catch (IOException ex) {
//            }
//        }
//    }
//
//    private HttpResponse forward(HttpClient httpclient, String verb, String uri,
//                                 HttpServletRequest request, MultiValueMap<String, String> headers,
//                                 MultiValueMap<String, String> params, InputStream requestEntity)
//            throws Exception {
//        Map<String, Object> info = this.helper.debug(verb, uri, headers, params,
//                requestEntity);
//        URL host = new URL(uri);
//        HttpHost httpHost = getHttpHost(host);
//
//        HttpRequest httpRequest;
//        int contentLength = request.getContentLength();
//        InputStreamEntity entity = new InputStreamEntity(requestEntity, contentLength,
//                request.getContentType() != null
//                        ? ContentType.create(request.getContentType()) : null);
//        switch (verb.toUpperCase()) {
//            case "POST":
//                HttpPost httpPost = new HttpPost(uri);
//                httpRequest = httpPost;
//                httpPost.setEntity(entity);
//                break;
//            case "PUT":
//                HttpPut httpPut = new HttpPut(uri);
//                httpRequest = httpPut;
//                httpPut.setEntity(entity);
//                break;
//            case "PATCH":
//                HttpPatch httpPatch = new HttpPatch(uri);
//                httpRequest = httpPatch;
//                httpPatch.setEntity(entity);
//                break;
//            default:
//                httpRequest = new BasicHttpRequest(verb, uri);
//
//        }
//        try {
//            httpRequest.setHeaders(convertHeaders(headers));
//            HttpResponse zuulResponse = forwardRequest(httpclient, httpHost, httpRequest);
//
//            return zuulResponse;
//        } finally {
//        }
//    }
//
//    private HttpResponse forwardRequest(HttpClient httpclient, HttpHost httpHost,
//                                        HttpRequest httpRequest) throws IOException {
//        return httpclient.execute(httpHost, httpRequest);
//    }
//
//    private HttpHost getHttpHost(URL host) {
//        HttpHost httpHost = new HttpHost(host.getHost(), host.getPort(),
//                host.getProtocol());
//        return httpHost;
//    }
//
//    private Header[] convertHeaders(MultiValueMap<String, String> headers) {
//        List<Header> list = new ArrayList<>();
//        for (String name : headers.keySet()) {
//            for (String value : headers.get(name)) {
//                list.add(new BasicHeader(name, value));
//            }
//        }
//        return list.toArray(new BasicHeader[0]);
//    }
//
//    private MultiValueMap<String, String> revertHeaders(Header[] headers) {
//        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
//        for (Header header : headers) {
//            String name = header.getName();
//            if (!map.containsKey(name)) {
//                map.put(name, new ArrayList<String>());
//            }
//            map.get(name).add(header.getValue());
//        }
//        return map;
//    }
//
//    private void setResponse(HttpResponse response) throws IOException {
//        this.helper.setResponse(response.getStatusLine().getStatusCode(),
//                response.getEntity() == null ? null : response.getEntity().getContent(),
//                revertHeaders(response.getAllHeaders()));
//    }
//
//    private InputStream getRequestBody(HttpServletRequest request) {
//        InputStream requestEntity = null;
//        try {
//            requestEntity = request.getInputStream();
//        } catch (IOException ex) {
//            // no requestBody is ok.
//        }
//        return requestEntity;
//    }
//
//    private String getVerb(HttpServletRequest request) {
//        String sMethod = request.getMethod();
//        return sMethod.toUpperCase();
//    }
//
//    private String buildRouteString(String oldEndpoint, String newEndpoint, String serviceName) {
//        System.out.println(oldEndpoint + "===" + newEndpoint + "======" + serviceName);
//        int index = oldEndpoint.indexOf(serviceName);
//
////        String strippedRoute = oldEndpoint.substring(index + serviceName.length());
//        System.out.println("Target route: " + String.format("%s%s", newEndpoint, serviceName));
//        return String.format("%s%s", newEndpoint, serviceName);
//    }
//
//    public AbTestingRoute getAbTestingRoute(String HeadOauths) {
//        ResponseEntity<AbTestingRoute> restExchange = null;
//        restExchange = restTemplate.exchange("http://specialroutesservice/v1/route/abtesting/{serviceName}",
//                HttpMethod.GET, null, AbTestingRoute.class, HeadOauths);
//        return restExchange.getBody();
//    }
//
//    public String getURL(String HeadOauths) {
//        String test = restTemplate.getForObject("http://eureka-server/getgarden/{id}", String.class, HeadOauths);
//        return test;
//    }
//
//    public boolean useSpecialRoute(String test) {
//        Random random = new Random();
//        int value = random.nextInt((10 - 1) + 1) + 1;
//        System.out.println("value===" + value);
//        if (3 < value) {
//            return true;
//        }
//        return false;
//    }
//}
