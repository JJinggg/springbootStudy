package com.devjin.springstu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class getstuController {
    @GetMapping("/getStu")
    public Map<String,Object> getString() {

        stuController _stu = new stuController();
        return _stu.getTest();
    }
}
