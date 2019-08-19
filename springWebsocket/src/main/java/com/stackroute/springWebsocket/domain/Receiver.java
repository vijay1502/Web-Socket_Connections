package com.stackroute.springWebsocket.domain;

public class Receiver {
    private String content;

    public Receiver(String content) {
        this.content = content;
    }

    public Receiver() {
    }

    public String getContent() {
        return content;
    }
}
