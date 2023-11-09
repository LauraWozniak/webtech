package com.example.demo.springboot.web.api.web.api;

import com.example.demo.springboot.web.api.service.ErinnerungService;
import com.example.demo.springboot.web.api.web.api.Erinnerung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ErinnerungRestController {


    @Autowired
    ErinnerungService service;


    private List<Erinnerung> erinnerung;

    public ErinnerungRestController() {
        erinnerung = new ArrayList<>();
        erinnerung.add(new Erinnerung(1, "hausaufgaben"));
        erinnerung.add(new Erinnerung(2, "Abgaben"));

    }
    @GetMapping(path = "/api/v1/erinnerungen")
    public List<Erinnerung> fetchErinnerungen(){
        return erinnerung;

    }
}
