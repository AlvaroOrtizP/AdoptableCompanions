package com.adoptable.companions.core.usecase.getoneanimal;

import com.adoptable.companions.core.domain.AnimalDetails;

public interface GetOneAnimalUseCase {
	AnimalDetails findById(Long id);
}
