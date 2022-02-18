package com.galoma;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
    @GetMapping("/response") //specify which address is going to call this method
    @ResponseBody //to get the string response
    public String getResponse() {
        return "FirstController returning first response!";
    }
}
