package com.nsb.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TopController {

    @RequestMapping("/")
    public String top() {
        return "index";
    }
}
