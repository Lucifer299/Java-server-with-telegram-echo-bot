package com.example.My_Server_Luci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
    @GetMapping("/word")
    public static String Hello() {
        return "hello Word";
    }
}
