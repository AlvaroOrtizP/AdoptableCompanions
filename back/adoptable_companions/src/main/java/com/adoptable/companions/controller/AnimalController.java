package com.adoptable.companions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adoptable.companions.dto.AnimalDTO;
import com.adoptable.companions.dto.AnimalProtectoraDTO;
import com.adoptable.companions.service.AnimalService;

@CrossOrigin
@RestController
@RequestMapping("/animales")
public class AnimalController {
	@Autowired
	AnimalService animalService;

	@GetMapping
	public ResponseEntity<Page<AnimalDTO>> getAnimals( @RequestParam(defaultValue = "0") int page,
		    @RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "") String raza,@RequestParam(defaultValue = "") String sexo) {
		try {
			Page<AnimalDTO> dtoPage = animalService.findAll(PageRequest.of(page, size), raza, sexo);			
	        return new ResponseEntity<>(dtoPage, HttpStatus.OK);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return ResponseEntity.badRequest().build();		}
	}

	@GetMapping("/{animalId}")
	public ResponseEntity<AnimalProtectoraDTO> obtenerInformacionAnimalYProtectora(@PathVariable Long animalId) {
		try {
			AnimalProtectoraDTO dto = animalService.obtenerInformacionAnimalYProtectora(animalId);
			return ResponseEntity.ok(dto);
		} catch (Exception e) {
			return (ResponseEntity<AnimalProtectoraDTO>) ResponseEntity.notFound();
		}
	}

}
