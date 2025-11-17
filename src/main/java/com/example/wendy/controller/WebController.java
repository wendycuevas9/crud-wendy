package com.example.wendy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping({"/", "/index"})
    public String index() {
        // Redirige solo "/" y "/index" al archivo estático index.html
        return "forward:/index.html";
    }
}
