package com.ws.controller;

import com.ws.entities.Persona;
import com.ws.service.PersonaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class ControllerPersona {


    @Autowired
    private PersonaService service;


    @GetMapping("/getPersona")
    public List<Persona> getPersonas(){

        return service.findAllPersona();
    }


    @PostMapping("/postPersona")
    public Persona postPersona(@RequestBody Persona persona){

        return service.savePersona(persona);
    }

}
