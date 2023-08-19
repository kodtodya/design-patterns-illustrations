package com.kodtodya.practice.service;

public class SMSServiceImpl implements MessageService {

    @Override
    public void sendMessage(String msg, String receiver) {
        //logic to send SMS
        System.out.println("SMS sent to " + receiver + " with Message=" + msg);
    }

}