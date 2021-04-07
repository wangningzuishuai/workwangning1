package com.leyou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }

 @GetMapping("/hello1")
    public String hello1(){
        return "hello spring boot";
    }
	
	@GetMapping("/hello2")
    public String hello2(){
        return "张三";
    }



	
	@GetMapping("/hello1")
    public String hello1(){
        return "hello spring boot";
    }

}
