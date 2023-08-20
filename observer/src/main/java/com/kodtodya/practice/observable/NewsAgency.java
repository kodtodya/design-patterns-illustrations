package com.kodtodya.practice.observable;

import com.kodtodya.practice.observer.Channel;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject: NewAgency
public class NewsAgency implements Agency {
    private List<Channel> channels = new ArrayList<>();
    private String latestNews;

    @Override
    public void registerChannel(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    @Override
    public void notifyChannels(String news) {
        latestNews = news;
        for (Channel channel : channels) {
            channel.breakingNews(latestNews);
        }
    }

    public void publishNews(String news) {
        System.out.println("News Agency publishing news: " + news);
        notifyChannels(news);
    }
}