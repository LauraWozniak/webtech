package com.example.demo.springboot.web.api.web.api;

import jakarta.persistence.*;


@Entity(name = "erinnerung")
public class Erinnerung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private long id;

    @Column (name = "Erinnerung", nullable = false)
    private String text;

    public Erinnerung() {
    }
    public Erinnerung(long id, String text){
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return id;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
