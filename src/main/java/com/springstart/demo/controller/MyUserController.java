package com.springstart.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RefreshScope
public class MyUserController {

    @Value("${test.user.name}")
    private String name;

    @Value("${test.user.age}")
    private Integer age;

    @RequestMapping("/test")
    public ResponseEntity<HashMap<String, Object>> query() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("age", age);
        return ResponseEntity.ok(map);
    }
}
