package com.galoma.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.galoma.model.Client;
import com.galoma.test.NotificatorType;
import com.galoma.test.Profiles;

@NotificatorType(Profiles.PRODUCTION)
@Component
public class SmsNotificator implements Notificator {

    @Override
    public void notify(Client client) {
        
    }

}
