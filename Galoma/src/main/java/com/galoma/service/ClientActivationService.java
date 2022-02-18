package com.galoma.service;

import org.springframework.stereotype.Component;

import com.galoma.model.Client;
import com.galoma.notification.Notificator;

@Component
public class ClientActivationService {
    public enum ActivationType {
        NEWACCOUNT,
        TWOFACTOR;
    }
    
    private Notificator notificator;

    public ClientActivationService(Notificator notificator) {
        this.notificator = notificator;
    }

    public void activate(Client client, ActivationType type) {
        notificator.notify(client);
    }
}
