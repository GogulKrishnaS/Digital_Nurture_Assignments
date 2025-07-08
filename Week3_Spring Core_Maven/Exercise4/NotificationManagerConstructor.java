package com.example.client;

import com.example.service.MessageService;

public class NotificationManagerConstructor {

    private MessageService messageService;

    public NotificationManagerConstructor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void process(String message) {
        messageService.sendMessage(message);
    }
}
