package com.galoma;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.galoma.model.Client;
import com.galoma.service.ClientActivationService;
import com.galoma.service.ClientActivationService.ActivationType;

@Controller
public class FirstController {

    ClientActivationService service;

    public FirstController(ClientActivationService service) {
        this.service = service;
    }
    @GetMapping("/response") //specify which address is going to call this method
    @ResponseBody //to get the string response
    public String getResponse() {
        Client lucas = new Client("lucas", "lucas.andre22@yahoo.com");
        service.activate(lucas, ActivationType.NEWACCOUNT);
        return lucas.toString();
    }
}
