package com.example.main;

import com.example.client.NotificationManager;
import com.example.client.NotificationManagerConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("--- Setter Injection ---");
        NotificationManager managerSetter =
                context.getBean("notificationManager", NotificationManager.class);
        managerSetter.process("Setter Injection message");

        System.out.println("--- Constructor Injection ---");
        NotificationManagerConstructor managerConstructor =
                context.getBean("notificationManagerConstructor", NotificationManagerConstructor.class);
        managerConstructor.process("Constructor Injection message");
    }
}
