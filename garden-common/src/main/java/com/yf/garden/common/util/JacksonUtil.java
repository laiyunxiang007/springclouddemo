package com.yf.garden.common.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/**
 * json工具
 * @author 张继生
 */
public final class JacksonUtil {

    private static final ObjectMapper mapper = new ObjectMapper();

    static {
        // =========================================================================
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);


        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);

        // =========================================================================

        mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);


        mapper.configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);
    }

    /**
     * json转Object
     * @param json 原始json
     * @param clazz Object类型
     * @param <T> 泛型声明
     * @return Object
     */
    public static <T> T fromJson(final String json, Class<T> clazz) {
        if (null == json || "".equals(json)) {
            return null;
        }

        try {
            return mapper.readValue(json, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * json转Map
     * @param json 原始json
     * @return Map
     */
	public static Map json2Map(final String json) {
        return fromJson(json, Map.class);
    }

    /**
     * json转List
     * @param json 原始json
     * @param <T> 泛型声明
     * @return List
     */
    public static <T> List<T> json2List(final String json) {
        if (null == json || "".equals(json)) {
            return null;
        }

        try {
            return mapper.readValue(json, new TypeReference<List<T>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    /**
     * object转json
     * @param obj 对象
     * @return json字符串
     */
    public static String toJson(final Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
    /*public static String toJson(Object obj)
    {
        try
        {
            StringWriter sw = new StringWriter();
            dao.writeValue(sw, obj);
            return sw.toString();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }*/

}
