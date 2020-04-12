package com.ims.entity;

public class Notification {

    private Integer fromUserId;
    private Integer toUserId;
    private String message;

    public Notification(Integer fromUserId, Integer toUserId, String message) {
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
        this.message = message;
    }

    public Integer getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Integer getToUserId() {
        return toUserId;
    }

    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}