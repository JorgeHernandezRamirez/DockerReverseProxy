package com.jorgehernandezramirez.springboot.reverseproxy.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ServerController {

    public ServerController(){
        //Para Spring
    }
 
    @RequestMapping("/server")
    public String getServerInfo(final HttpServletRequest httpServletRequest) {
        return httpServletRequest.getServerName() + ":"
                + httpServletRequest.getRemotePort();
    }
}