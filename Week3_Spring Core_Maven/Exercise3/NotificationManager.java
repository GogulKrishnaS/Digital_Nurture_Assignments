package com.example.client;

import com.example.service.MessageService;

public class NotificationManager {
    private MessageService messageService;

    // setter
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void process(String message) {
        messageService.sendMessage(message);
    }
}
