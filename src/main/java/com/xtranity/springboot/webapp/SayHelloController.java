package com.xtranity.springboot.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! whar are you learning today?";
    }

    @RequestMapping("hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        return "<h1>Hello! what are you learning today?</h1>";
    }

    @RequestMapping("hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
