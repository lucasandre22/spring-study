package com.galoma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.galoma.notification.EmailNotificator;
import com.galoma.test.NotificatorType;
import com.galoma.test.Profiles;

//@Configuration
public class GalomaConfig {

    //@Bean
    //@NotificatorType(Profiles.PRODUCTION)
    //@Bean(initMethod="init", destroyMethod="destroy")
    public EmailNotificator emailNotificator() {
        return new EmailNotificator("SMTP");
    }
}
