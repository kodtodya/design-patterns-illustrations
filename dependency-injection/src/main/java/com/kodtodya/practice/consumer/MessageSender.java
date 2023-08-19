package com.kodtodya.practice.consumer;

public interface MessageSender {

	void processMessages(String msg, String rec);
}