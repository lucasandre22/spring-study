package com.galoma.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.galoma.model.Client;
import com.galoma.test.NotificatorType;
import com.galoma.test.Profiles;

@NotificatorType(Profiles.DEVELOP)
@Component
public class EmailNotificator implements Notificator {

    private String protocol;

    public EmailNotificator() {
        this.protocol = null;
    }

    public EmailNotificator(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public void notify(Client client) {

    }

}
