package com.example.demo.springboot.web.api.persistance;

import com.example.demo.springboot.web.api.web.api.Erinnerung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ErinnerungRepository extends CrudRepository<ErinnerungEntity,Long> {
    List<ErinnerungEntity> findAllByText(String text);
}
