
package com.ims.service;

public interface INotificationService {

    public void notify(Integer fromUserId, Integer toUserId, String message);

}