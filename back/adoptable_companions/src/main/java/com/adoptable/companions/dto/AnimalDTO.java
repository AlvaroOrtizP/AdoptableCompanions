package com.adoptable.companions.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AnimalDTO {
    private Long animalId;
    private String animalImagenUrl;
    private String animalNombre;
    private Integer edad;
}
