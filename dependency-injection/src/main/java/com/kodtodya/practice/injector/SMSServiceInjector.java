package com.kodtodya.practice.injector;

import com.kodtodya.practice.consumer.MessageSender;
import com.kodtodya.practice.consumer.MessageSenderImpl;
import com.kodtodya.practice.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public MessageSender getConsumer() {
        return new MessageSenderImpl(new SMSServiceImpl());
    }

}