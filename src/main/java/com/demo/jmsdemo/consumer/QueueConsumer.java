package com.demo.jmsdemo.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumer {

    @JmsListener(destination = "demo-queue", containerFactory = "queueListenerFactory")
    public void receiveQueueMessage(String message) {
        System.out.println("Queue Consumer received: " + message);
    }
}
