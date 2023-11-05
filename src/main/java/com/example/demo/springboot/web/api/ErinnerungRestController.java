package com.example.demo.springboot.web.api;

import com.example.demo.springboot.web.api.Erinnerung;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ErinnerungRestController {

    private List <Erinnerung> erinnerungs;

    public ErinnerungRestController(){
        erinnerungs = new ArrayList<>();
        erinnerungs.add(new Erinnerung(1,"Hausaufgabe"));
        erinnerungs.add(new Erinnerung(2,"Arbeitsblatt"));
    }

    @GetMapping(path = "/api/v1/erinnerungen")
    public List<Erinnerung> fetchErinnerungen(){
        return erinnerungs;

    }
}
