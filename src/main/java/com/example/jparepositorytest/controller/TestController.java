package com.example.jparepositorytest.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Incheol Jung
 */
@Controller
@ResponseBody
@Component
@RequestMapping(value = "")
public class TestController {
    @GetMapping("test")
    public String test(){

        Set<Lark> exaltation = new HashSet();
        return "incheol22222";
    }
}

