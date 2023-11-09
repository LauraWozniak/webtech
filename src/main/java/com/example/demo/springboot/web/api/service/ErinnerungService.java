package com.example.demo.springboot.web.api.service;

import com.example.demo.springboot.web.api.persistance.ErinnerungEntity;
import com.example.demo.springboot.web.api.web.ErinnerungmanipulationRequest;
import com.example.demo.springboot.web.api.web.api.Erinnerung;
import com.example.demo.springboot.web.api.persistance.ErinnerungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.springboot.web.api.web.api.ErinnerungRestController;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ErinnerungService {

    private final ErinnerungRepository erinnerungRepository;

    public ErinnerungService(ErinnerungRepository erinnerungRepository) {
        this.erinnerungRepository = erinnerungRepository;
    }
    public Erinnerung save(Erinnerung erinnerung) {
        ErinnerungEntity erinnerungEntity = new ErinnerungEntity(erinnerung.getText());
        erinnerungEntity = erinnerungRepository.save(erinnerungEntity);
        return transformEntity(erinnerungEntity);
    }

    public List<Erinnerung> getAll() {
        Iterable<ErinnerungEntity> iterator = erinnerungRepository.findAll();
        List<Erinnerung> erinnerungs = new ArrayList<>();
        for (ErinnerungEntity erinnerungEntity : iterator) {
            erinnerungs.add(transformEntity(erinnerungEntity));
        }
        return erinnerungs;
    }


    public Erinnerung findById(Long id) {
        var erinnerungEntity = erinnerungRepository.findById(id);
        return erinnerungEntity.map(this::transformEntity).orElse(null);
    }

    public Erinnerung create(ErinnerungmanipulationRequest request) {
        var erinnerungEntity = new ErinnerungEntity(request.getText());
        erinnerungEntity = erinnerungRepository.save(erinnerungEntity);
        return transformEntity(erinnerungEntity);
    }
    public Erinnerung update(Long id, ErinnerungmanipulationRequest request) {
        var erinnerungEntityOptional = erinnerungRepository.findById(id);
        if (erinnerungEntityOptional.isEmpty()) {
            return null;
        }

        var erinnerungEntity = erinnerungEntityOptional.get();
        erinnerungEntity.setText(request.getText());
        erinnerungEntity = erinnerungRepository.save(erinnerungEntity);

        return transformEntity(erinnerungEntity);
    }
    private Erinnerung transformEntity(ErinnerungEntity erinnerungEntity) {
        return new Erinnerung(
                erinnerungEntity.getId(),
                erinnerungEntity.getText()
        );
    }

    public boolean deleteById(Long id) {
        if (!erinnerungRepository.existsById(id)) {
            return false;
        }

        erinnerungRepository.deleteById(id);
        return true;


    }

}
