package com.daas.basedata;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HttpTest {
    @Test
    public void requestHttp() throws IOException {
        System.out.println("123");
        Map headMap = new HashMap();
        headMap.put("Content-Type", "text/javascript; charset=UTF-8");
        System.out.println(HttpRequestUtils.get("http://api.map.baidu.com/shangquan/forward/?qt=sub_area_list&ext=1&level=3&areacode=1&business_flag=0",headMap));
    }
}
