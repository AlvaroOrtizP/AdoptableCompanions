package com.adoptable.companions.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.adoptable.companions.core.domain.AnimalDTO;
import com.adoptable.companions.core.domain.AnimalDetails;
import com.adoptable.companions.entity.AnimalEntity;
import com.adoptable.companions.error.AnimalNotFoundException;
import com.adoptable.companions.mapper.AnimalProtectoraMapper;
import com.adoptable.companions.repository.AnimalRepository;

@Service
public class AnimalService {
	private static final Logger log = LoggerFactory.getLogger(AnimalService.class);

	@Autowired
	AnimalRepository animalRepository;

	public AnimalDetails obtenerInformacionAnimalYProtectora(Long id) {
		log.info("obtenerInformacionAnimalYProtectora con el id: " + id);
		AnimalEntity animal = animalRepository.findById(id).orElse(null);
		if (animal == null) {
			log.info("No se obtiene ningun resultado por lo cual se manda una excepcion");
			throw new AnimalNotFoundException("Animal no encontrado");
		}
		AnimalDetails res = AnimalProtectoraMapper.INSTANCE.toDTO(animal, animal.getProtectora());
		res.getAnimalDTO().setEdad(AnimalProtectoraMapper.INSTANCE.calculateAge(animal.getAnioNacimiento()));
		log.info(
				"Se encontro un registro con el id indicado. los datos obtenidos son los siguiente: " + res.toString());
		return res;
	}

	public Page<AnimalDTO> findAll(Pageable pageable, String tipoAnimal, String sexo) {
		
		Page<AnimalEntity> animalPage = animalRepository.customFind(tipoAnimal, sexo, pageable.getPageNumber(), pageable.getPageSize());

		Page<AnimalDTO> res = AnimalProtectoraMapper.INSTANCE.toDTOPage(animalPage);
		return res;
	}

}
