package com.stackroute.springWebsocket.domain;

public class Messages {
    private String message;

    public Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
