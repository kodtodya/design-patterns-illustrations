package com.kodtodya.practice;

import com.kodtodya.practice.service.Internet;
import com.kodtodya.practice.service.ProxyInternet;

public class InternetConnectorClient {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("kodtodya.org");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}