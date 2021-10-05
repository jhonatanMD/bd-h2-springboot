package com.ws.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name = "apellido_paterno")
    private String apePaterno;
    @JsonProperty("apeMaterno")
    private String apellido_materno;

    public Persona(String nombre, String apePaterno, String apellido_materno) {
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apellido_materno = apellido_materno;
    }
}
