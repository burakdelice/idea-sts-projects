package com.burakdelice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping
@RestController
public class PersonController {
    @GetMapping
    public String getHello(){
        return "Merhaba Spring Boot";
    }
    @GetMapping("/personel")
    public String getPersonelInfo(){
        return "Personel Bilgisi";
    }

}
