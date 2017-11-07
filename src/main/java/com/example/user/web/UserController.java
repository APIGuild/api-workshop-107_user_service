package com.example.user.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 10/24/17.
 */
@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {
    @Value("${test.data}")
    private String data;

    @RequestMapping("/{userId}")
    public String getUser(@PathVariable("userId") String userId) {
        return "This is a simple user : " + data;
    }
}
