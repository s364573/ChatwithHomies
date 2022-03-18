package com.example.chat;

public class InputChat {

    private String user;
    private String chat;

    public InputChat(String user, String chat){
        this.user = user;
        this.chat = chat;
    }

    public String getUser(){
        return user;
    }

    public void setUser(String user){
        this.user = user;
    }

    public String getChat(){
        return chat;
    }

    public void setChat(String chat){
        this.chat = chat;
    }
}
