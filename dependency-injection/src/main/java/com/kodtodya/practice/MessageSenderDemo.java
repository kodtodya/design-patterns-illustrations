package com.kodtodya.practice;

import com.kodtodya.practice.consumer.MessageSender;
import com.kodtodya.practice.injector.EmailServiceInjector;
import com.kodtodya.practice.injector.MessageServiceInjector;
import com.kodtodya.practice.injector.SMSServiceInjector;

public class MessageSenderDemo {

    public static void main(String[] args) {
        String msg = "Hi kodtodya";
        String email = "kodt@dya.com";
        String phone = "4088888888";
        MessageServiceInjector injector = null;
        MessageSender app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}