package com.galoma.notification;

import org.springframework.stereotype.Component;

import com.galoma.model.Client;

@Component
public interface Notificator {
    public void notify(Client client);
}
