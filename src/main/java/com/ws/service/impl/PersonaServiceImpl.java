package com.ws.service.impl;

import com.ws.entities.Persona;
import com.ws.repository.PersonaRepository;
import com.ws.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private  PersonaRepository repository;

    @Override
    public List<Persona> findAllPersona() {
        return repository.findAll();
    }

    @Override
    public Persona savePersona(Persona persona) {
        return repository.save(persona);
    }
}
