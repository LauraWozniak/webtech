package com.example.demo.springboot.web.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErinnerungService {

    @Autowired
    ErinnerungRepository repo;

    public Erinnerung save(Erinnerung erinnerung){
        return repo.save(erinnerung);
    }
    public Erinnerung get(Long id){
        return repo.findById(id).orElseThrow(()-> new RuntimeException());
    }


}
