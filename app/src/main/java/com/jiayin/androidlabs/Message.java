package com.jiayin.androidlabs;

public class Message {
    private String message;
    private int messageType;

    public Message(String message){
        setMessage(message);
    }

    public Message(String message, int messageType){
        setMessage(message);
        setMessage_type(messageType);
    }


    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMessage_type() {
        return messageType;
    }

    public void setMessage_type(int message_type) {
        this.messageType = message_type;
    }
}
