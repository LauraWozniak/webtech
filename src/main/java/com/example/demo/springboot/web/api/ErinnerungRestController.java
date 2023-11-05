package com.example.demo.springboot.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ErinnerungRestController {


    @Autowired
    ErinnerungService service;


    @PostMapping(path = "/erinnerungs")
    public Erinnerung createErinnerung(@RequestBody Erinnerung erinnerung){
        return service.save(erinnerung);
    }
    @GetMapping(path = "/erinnerungs/{id}")
    public Erinnerung getErinnerung(@PathVariable String id){
        Long erinnerungId = Long.parseLong(id);
        return service.get(erinnerungId);

    }
}
