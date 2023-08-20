package com.adoptable.companions.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "animales")
public class AnimalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String nombre;

	private String chip;

	@Column(name = "anio_nacimiento")
	private Date anioNacimiento;


	@Column(name = "tipo_animal")
	private String tipoAnimal;

	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "imagen_url") 
    private String imagenUrl;
	
	@ManyToOne
    @JoinColumn(name = "protectora_id")
    private ProtectoraEntity protectora;
}