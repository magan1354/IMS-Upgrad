package com.ims.service;

import com.ims.actor.SystemUser;
import com.ims.data.SystemUserHolder;
import com.ims.entity.Notification;

public class DashboardNotificationService implements INotificationService {

    public void notify(Integer fromUserId, Integer toUserId, String message) {

        SystemUser systemUser = SystemUserHolder.fetchById(toUserId);

        Notification notification = new Notification(fromUserId, toUserId, message);

        systemUser.notify(notification);

    }
}