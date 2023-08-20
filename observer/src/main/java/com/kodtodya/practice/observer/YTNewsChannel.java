package com.kodtodya.practice.observer;

// Concrete Observer: NewsChannel
public class YTNewsChannel implements Channel {
    private String name;

    public YTNewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void breakingNews(String news) {
        System.out.println("YouTube : '" + name + "' received news: " + news);
    }
}