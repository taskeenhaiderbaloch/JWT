package com.JWT.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JWTController {


    @RequestMapping({"/hello"})
    public String firstPage() {
        return "Hello World";
    }
}
