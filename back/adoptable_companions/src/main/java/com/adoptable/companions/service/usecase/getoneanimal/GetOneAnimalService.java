package com.adoptable.companions.service.usecase.getoneanimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adoptable.companions.core.domain.AnimalDetails;
import com.adoptable.companions.core.usecase.getoneanimal.GetOneAnimalUseCase;
import com.adoptable.companions.entity.AnimalEntity;
import com.adoptable.companions.error.AnimalNotFoundException;
import com.adoptable.companions.mapper.AnimalProtectoraMapper;
import com.adoptable.companions.repository.AnimalRepository;

@Service
public class GetOneAnimalService implements GetOneAnimalUseCase {
	private static final Logger log = LoggerFactory.getLogger(GetOneAnimalService.class);
	@Autowired
	AnimalRepository animalRepository;

	@Override
	public AnimalDetails findById(Long id) {
		AnimalDetails res = null;
		try {
			log.info("obtenerInformacionAnimalYProtectora con el id: " + id);
			AnimalEntity animal = animalRepository.findById(id).orElse(null);
			if (animal == null) {
				log.info("No se obtiene ningun resultado por lo cual se manda una excepcion");
				throw new AnimalNotFoundException("Animal no encontrado");
			}
			res = AnimalProtectoraMapper.INSTANCE.toDTO(animal, animal.getProtectora());
			res.getAnimalDTO().setEdad(AnimalProtectoraMapper.INSTANCE.calculateAge(animal.getAnioNacimiento()));
			log.info("Se encontro un registro con el id indicado. los datos obtenidos son los siguiente: "
					+ res.toString());

		} catch (Exception e) {
			log.error("NO SE HA ENCONTRADO EL ANIMAL");
		}
		return res;
	}

}
