package com.kodtodya.practice.observer;

// Concrete Observer: NewsChannel
public class TVNewsChannel implements Channel {
    private String name;

    public TVNewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void breakingNews(String news) {
        System.out.println("TV : '" + name + "' received news: " + news);
    }
}