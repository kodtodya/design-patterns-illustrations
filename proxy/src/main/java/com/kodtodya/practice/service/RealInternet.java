package com.kodtodya.practice.service;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Connected to " + serverHost);
    }
}