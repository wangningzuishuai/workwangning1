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
        return "张三范德萨";
    }



	
	@GetMapping("/hello3")
    public String hello3(){
        return "hello spring boot";
    }

}
