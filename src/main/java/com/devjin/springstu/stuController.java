package com.devjin.springstu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class stuController {
    @GetMapping("/test")
    public Map<String, Object> getTest() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("a",1);
        resultMap.put("b",2);
        resultMap.put("c",3);
        return resultMap;
    }

    @RestController
    public class getController {
        @GetMapping("/getTestStu")
        public Map<String,Object> getString() {

            stuController _stu = new stuController();
            Map<String,Object> resultMap = new HashMap<>();
            resultMap = _stu.getTest();
            resultMap.put("d",4);
            return resultMap;
        }
    }
}

