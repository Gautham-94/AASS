package com.nemos.AASS.AASS.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("hello")
    public String getHello(HttpServletRequest request){
        return "hello Sir" + request.getSession().getId();
    }

    @GetMapping("getToken")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("postHello")
    public String postHello(@RequestBody String req){
        return req;
    }


}
