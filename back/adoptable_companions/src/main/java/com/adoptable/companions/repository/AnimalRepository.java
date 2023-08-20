package com.adoptable.companions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adoptable.companions.entity.AnimalEntity;

public interface AnimalRepository extends JpaRepository<AnimalEntity, Long>, AnimalRepositoryCustom {
	
}
