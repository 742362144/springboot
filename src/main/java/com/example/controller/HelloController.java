package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Coder on 2017/3/26.
 */
@RestController
public class HelloController {

    @RequestMapping(value = {"/hello", "hi"}, method = RequestMethod.GET)
    public String sayHello(){
        return "hello spring boot!";
    }
}
