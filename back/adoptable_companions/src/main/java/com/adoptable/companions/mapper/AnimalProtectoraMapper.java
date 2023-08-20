package com.adoptable.companions.mapper;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import com.adoptable.companions.dto.AnimalDTO;
import com.adoptable.companions.dto.AnimalProtectoraDTO;
import com.adoptable.companions.entity.AnimalEntity;
import com.adoptable.companions.entity.ProtectoraEntity;


@Mapper
public interface AnimalProtectoraMapper {
	AnimalProtectoraMapper INSTANCE = Mappers.getMapper(AnimalProtectoraMapper.class);

    @Mapping(source = "animal.id", target = "animalDTO.animalId")
    @Mapping(source = "protectora.id", target = "protectoraDTO.protectoraId")
    @Mapping(source = "animal.nombre", target = "animalDTO.animalNombre")
    @Mapping(source = "protectora.name", target = "protectoraDTO.protectoraNombre")
    @Mapping(source = "protectora.logo", target = "protectoraDTO.protectoraLogo")
    @Mapping(source = "animal.imagenUrl", target = "animalDTO.animalImagenUrl")
    AnimalProtectoraDTO toDTO(AnimalEntity animal, @Context ProtectoraEntity protectora);
    
    
    
    List<AnimalDTO> toDTOList(List<AnimalEntity> animalEntities);

    @Mapping(source = "id", target = "animalId")
    @Mapping(source = "imagenUrl", target = "animalImagenUrl")
    @Mapping(source = "nombre", target = "animalNombre")
    @Mapping(target = "edad", expression = "java(calculateAge(animalEntity.getAnioNacimiento()))")
    AnimalDTO toDTO(AnimalEntity animalEntity);
    
    
    
    default Page<AnimalDTO> toDTOPage(Page<AnimalEntity> animalEntityPage) {
        List<AnimalDTO> animalDTOList = animalEntityPage.getContent()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());

        return new PageImpl<>(animalDTOList, animalEntityPage.getPageable(), animalEntityPage.getTotalElements());
    }
    
    default int calculateAge(Date fechaNacimiento) {
        if (fechaNacimiento == null) {
            return 0;
        }

        Calendar now = Calendar.getInstance();
        Calendar dob = Calendar.getInstance();
        dob.setTime(fechaNacimiento);

        int age = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        return age;
    }

}
