package com.kodtodya.practice.injector;

import com.kodtodya.practice.consumer.MessageSender;

public interface MessageServiceInjector {

    public MessageSender getConsumer();
}