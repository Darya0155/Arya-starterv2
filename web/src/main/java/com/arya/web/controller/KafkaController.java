package com.arya.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {




        @GetMapping
        public String testGet(){
            return "Hello world";
        }

}
