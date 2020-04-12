package com.ims.service;

public class EmailNotificationService implements INotificationService {

    public void notify(Integer fromUserId, Integer toUserId, String message) {
        // Code implementation for sending email to the user represented by toUserId

        System.out.println("Sending email notification to user: "+toUserId);
    }
}