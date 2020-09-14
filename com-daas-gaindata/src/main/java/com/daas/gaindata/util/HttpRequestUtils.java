package com.daas.gaindata.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class HttpRequestUtils {
    public static String client(String url, HttpMethod method, MultiValueMap<String, String> params){
        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        //  请勿轻易改变此提交方式，大部分的情况下，提交方式都是表单提交
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(params, headers);
        //  执行HTTP请求
        ResponseEntity<String> response = client.exchange(url, HttpMethod.GET, requestEntity, String.class);
        return response.getBody();
    }

    public static String getResponseStr(String url){
        log.info(String.format("从[%s]读取数据中...", url));
        String jsonStr = HttpRequestUtils.client(url, HttpMethod.GET,new LinkedMultiValueMap<>());
        return jsonStr;
    }

    public static String getResponseStr(String url,MultiValueMap<String, String> multiValueMap){
        log.info(String.format("从[%s]读取数据中...", url));
        if (null==multiValueMap) {
            multiValueMap = new LinkedMultiValueMap<>();
        }
        String jsonStr = HttpRequestUtils.client(url, HttpMethod.GET,multiValueMap);
        return jsonStr;
    }
}
