package com.galoma.test;

import org.springframework.context.annotation.Profile;

import com.galoma.model.Client;
import com.galoma.notification.Notificator;

@Profile("dev") //to use that, it needs to be defined in application.properties file as the following: spring.properties.active = dev, so it will use all the beans defined with it.
public class EmailNotificatorMock implements Notificator {

    private String protocol;

    public EmailNotificatorMock(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public void notify(Client client) {

    }

}
