package com.example.eatathome.Client.Activities.Model;

import android.app.Notification;

public class  Sender {

    public String to;
    public Notification notification;

    public Sender(String token, com.example.eatathome.Client.Activities.Model.Notification notification){

    }

    public Sender(String to, Notification notification) {
        this.to = to;
        this.notification = notification;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
