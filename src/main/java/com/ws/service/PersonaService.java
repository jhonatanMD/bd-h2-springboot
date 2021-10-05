package com.ws.service;

import com.ws.entities.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> findAllPersona();
    Persona savePersona(Persona persona);


}
