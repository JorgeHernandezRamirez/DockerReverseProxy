package com.jorgehernandezramirez.springboot.reverseproxy.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

@RestController
public class RandomController {

    private Double randomValue;

    public RandomController(){
        //Para Spring
    }

    @PostConstruct
    public void initialization(){
        this.randomValue = Math.random();
    }
 
    @RequestMapping("/random")
    public Double getRandomValue() {
        return randomValue;
    }
}