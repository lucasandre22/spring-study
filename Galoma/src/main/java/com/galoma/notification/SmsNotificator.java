package com.galoma.notification;

import org.springframework.stereotype.Component;

import com.galoma.model.Client;

@Component
public class SmsNotificator implements Notificator {

    @Override
    public void notify(Client client) {
        
    }

}
