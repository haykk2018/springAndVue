package com.example.springandvue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class firstController {

    @GetMapping("first")
    public List first() {
        List l = List.of("aaaa", "bbbb", "ggggg");
        return l;
    }
}
