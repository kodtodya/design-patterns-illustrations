package com.kodtodya.practice;

import com.kodtodya.practice.observable.NewsAgency;
import com.kodtodya.practice.observer.Channel;
import com.kodtodya.practice.observer.TVNewsChannel;
import com.kodtodya.practice.observer.YTNewsChannel;

import java.util.List;

public class ObserverPatternExample {
    public static void main(String[] args) {
        List<Channel> channels = List.of(new TVNewsChannel("English News"),
                new TVNewsChannel("Hindi News"),
                new YTNewsChannel("My News"),
                new YTNewsChannel("India News"));
        NewsAgency agency = new NewsAgency();

        for (Channel channel : channels)
            agency.registerChannel(channel);

        agency.publishNews("Breaking News: kodtodya has completed the Observer design pattern program!!!");
    }
}