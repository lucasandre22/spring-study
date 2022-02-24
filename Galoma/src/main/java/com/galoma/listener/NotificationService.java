package com.galoma.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    @EventListener
    public void eventNotificationListener(EventNotification event) {
        System.out.println("EventNotification received!");
    }
}
