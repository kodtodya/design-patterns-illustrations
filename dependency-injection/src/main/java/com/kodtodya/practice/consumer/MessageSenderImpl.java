package com.kodtodya.practice.consumer;

import com.kodtodya.practice.service.MessageService;

public class MessageSenderImpl implements MessageSender {

    private MessageService service;

    public MessageSenderImpl(MessageService svc) {
        this.service = svc;
    }

    @Override
    public void processMessages(String msg, String rec) {
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }

}