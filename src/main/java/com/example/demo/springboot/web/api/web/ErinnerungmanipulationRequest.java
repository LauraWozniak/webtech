package com.example.demo.springboot.web.api.web;

public class ErinnerungmanipulationRequest {
    private String text;

    public ErinnerungmanipulationRequest(String text) {
            this.text = text;
    }

    public String getText() {
            return text;
    }

    public void setText(String text) {
            this.text = text;
    }

}
