package com.epam.edp.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Pavlo_Yemelianov
 */
@RestController
public class HelloEdpController {

    @Value("${application.properties.from.configmap:}")
    private String propertiesFromConfigmap;

    @Value("${application.secret.properties.from.secret:}")
    private String secretPropertiesFromSecret;

    @GetMapping(value = "/api/hello")
    public String hello() {
        return "Hello, EDP!";
    }

    @GetMapping(value = "/env")
    public Map<String, String> env() {
        return System.getenv();
    }
}
