package com.stackroute.springWebsocket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {
    private SimpMessagingTemplate simpMessagingTemplate;
    @Autowired
    WebController(SimpMessagingTemplate template) {
        this.simpMessagingTemplate = template;
    }
    @MessageMapping("/send/message")
    public void receiverMessage(String message){
        this.simpMessagingTemplate.convertAndSend("/chat",message);
    }
}
