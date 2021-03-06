package com.effx.Schoolmeal.dto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public DTO greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new DTO(counter.incrementAndGet(), String.format(template, name));
    }


}
