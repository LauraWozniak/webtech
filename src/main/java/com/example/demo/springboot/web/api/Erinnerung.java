package com.example.demo.springboot.web.api;

import jakarta

public class Erinnerung {


    @Id

    private long id;
    private String text;

    public Erinnerung(long id, String text){
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
