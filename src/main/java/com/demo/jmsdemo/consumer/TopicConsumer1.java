package com.demo.jmsdemo.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumer1 {

    @JmsListener(destination = "demo-topic", containerFactory = "topicListenerFactory")
    public void receiveTopicMessage(String message) {
        System.out.println("Topic Consumer 1 received: " + message);
    }
}
