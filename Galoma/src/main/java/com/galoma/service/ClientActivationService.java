package com.galoma.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.galoma.listener.EventNotification;
import com.galoma.model.Client;
import com.galoma.notification.Notificator;
import com.galoma.test.NotificatorType;
import com.galoma.test.Profiles;

@Component
public class ClientActivationService { //implements InitializingBean, DisposableBean

    public enum ActivationType {
        NEWACCOUNT,
        TWOFACTOR;
    }

    //@Autowired
    //@NotificatorType(Profiles.PRODUCTION)
    private Notificator notificator;

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public ClientActivationService(@NotificatorType(Profiles.PRODUCTION) Notificator notificator) {
        this.notificator = notificator;
        System.out.println("ClientActivationService:" + notificator);
    }

    public void activate(Client client, ActivationType type) {
        notificator.notify(client);
        
        //Lower the cohesion by doing this, Spring uses Observer as design pattern
        eventPublisher.publishEvent(new EventNotification());
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
