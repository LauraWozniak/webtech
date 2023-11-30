package com.example.demo.springboot.web.api.web.api;

import com.example.demo.springboot.web.api.service.ErinnerungService;
import com.example.demo.springboot.web.api.web.ErinnerungmanipulationRequest;
import com.example.demo.springboot.web.api.web.api.Erinnerung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class ErinnerungRestController {


    @Autowired
    ErinnerungService service;



    public ErinnerungRestController() {

    }
    @GetMapping(path = "/api/v1/erinnerungen", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Erinnerung> fetchErinnerungen(){
        return service.getAll();
    }
    @PostMapping("/api/v1/erinnerungen")
    public Erinnerung create(@RequestBody Erinnerung erinnerung) {
        return service.save(erinnerung);
    }

    //todo das aber nochmal für create und delete mapping


}
