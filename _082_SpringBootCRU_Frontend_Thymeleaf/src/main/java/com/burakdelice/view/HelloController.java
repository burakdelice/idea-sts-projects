package com.burakdelice.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping({"/","/hello"})
    public String hello(Model model, @RequestParam(value = "firstName", required = false, defaultValue = "BİLGİ_YOK") String firstName){
        model.addAttribute("firstName",firstName);
        return "hello";
    }
}
