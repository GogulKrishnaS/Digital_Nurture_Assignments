package com.example.service;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
