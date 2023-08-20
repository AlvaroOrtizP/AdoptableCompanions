package com.adoptable.companions.repository;

import org.springframework.data.domain.Page;

import com.adoptable.companions.entity.AnimalEntity;

public interface AnimalRepositoryCustom {
	 Page<AnimalEntity> customFind(String tipoAnimal, String sexo, int page, int size);
}
