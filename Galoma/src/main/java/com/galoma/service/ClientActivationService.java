package com.galoma.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.galoma.model.Client;
import com.galoma.notification.Notificator;
import com.galoma.test.NotificatorType;
import com.galoma.test.Profiles;

@Component
public class ClientActivationService {

    public enum ActivationType {
        NEWACCOUNT,
        TWOFACTOR;
    }

    //@Autowired
    //@NotificatorType(Profiles.PRODUCTION)
    private Notificator notificator;

    public ClientActivationService(@NotificatorType(Profiles.PRODUCTION) Notificator notificator) {
        this.notificator = notificator;
        System.out.println("ClientActivationService:" + notificator);
    }

    public void activate(Client client, ActivationType type) {
        notificator.notify(client);
    }

    @PostConstruct
    public void init() {
        System.out.println("Init bean");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy bean");
    }
}
