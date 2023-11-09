package com.example.demo.springboot.web.api.persistance;
import jakarta.persistence.*;

@Entity(name = "erinnerungen" )
public class ErinnerungEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "text", nullable = false)
    private String text;

    public ErinnerungEntity(String text) {
        this.text = text;
    }

    protected ErinnerungEntity() {
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

