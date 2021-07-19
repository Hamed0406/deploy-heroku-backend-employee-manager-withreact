package com.example.deployherokubackendemployeemanagerwithreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Controller
@SpringBootApplication
public class DeployHerokuBackendEmployeeManagerWithreactApplication {
    @RequestMapping("/")

    @ResponseBody
    String home() {
        return "Employee API for React FrontEnd";
    }
    public static void main(String[] args) {
        SpringApplication.run(DeployHerokuBackendEmployeeManagerWithreactApplication.class, args);
    }

}
