package com.kodtodya.practice.observable;

import com.kodtodya.practice.observer.Channel;

// Subject interface
public interface Agency {
    void registerChannel(Channel channel);

    void removeChannel(Channel channel);

    void notifyChannels(String news);
}