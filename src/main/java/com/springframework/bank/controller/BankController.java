package com.springframework.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {
    
    @RequestMapping("/")
    public String sendToScreen(Model model) {
        return "bank/html/account";
    }

}
