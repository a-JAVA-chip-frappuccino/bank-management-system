package com.springframework.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {
    
    @RequestMapping("/sendtoscreen")
    public String sendToScreen(Model model) {
        return "Hello, World!";
    }

}
