package com.adoptable.companions.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "adopciones")
public class AdopcionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private PersonaEntity persona;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private AnimalEntity animal;

    @Column(name = "fecha_adopcion")
    @Temporal(TemporalType.DATE)
    private Date fechaAdopcion;

    @Column(name = "estado_actual")
    private String estadoActual;  
    
    @Column(name = "sexo")
    private String sexo;  
    
}