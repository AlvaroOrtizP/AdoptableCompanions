package com.adoptable.companions.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.adoptable.companions.entity.AnimalEntity;
import com.adoptable.companions.service.AnimalService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public class AnimalRepositoryCustomImpl implements AnimalRepositoryCustom {
	@PersistenceContext
	private EntityManager entityManager;
	private static final Logger log = LoggerFactory.getLogger(AnimalRepositoryCustomImpl.class);

	@Override
	public Page<AnimalEntity> customFind(String tipoAnimal, String sexo, int page, int size) {
		String sql = "SELECT * FROM ANIMALES";
		String where = "";
		Map<String, Object> parameters = new HashMap<>();

		if (tipoAnimal != null && !tipoAnimal.isEmpty()) {
			where += " WHERE tipo_animal = :tipoAnimal";
			parameters.put("tipoAnimal", tipoAnimal.toUpperCase());
		}

		if (sexo != null && !sexo.isEmpty()) {
			where += (where.isEmpty() ? " WHERE " : " AND ") + "sexo = :sexo";
			parameters.put("sexo", sexo.toUpperCase());
		}

		String finalSql = where.isEmpty() ? sql : sql + where + " ORDER BY id DESC";
		log.info("customFind: la consulta usada es: " + finalSql);
		Query query = entityManager.createNativeQuery(finalSql, AnimalEntity.class);

		for (Map.Entry<String, Object> entry : parameters.entrySet()) {
			log.info("Parametro: "+ entry.getKey() + " con valor: "+ entry.getValue());
			query.setParameter(entry.getKey(), entry.getValue());
		}

		int startResult = page * size;
		query.setFirstResult(startResult).setMaxResults(size);

		List<AnimalEntity> resultList = query.getResultList();

		String countSql = "SELECT COUNT(*) FROM ANIMALES" + where;
		Query countQuery = entityManager.createNativeQuery(countSql);

		for (Map.Entry<String, Object> entry : parameters.entrySet()) {
			countQuery.setParameter(entry.getKey(), entry.getValue());
		}
		
		Long totalCount = ((Number) countQuery.getSingleResult()).longValue();

		Pageable pageable = PageRequest.of(page, size);
		return new PageImpl<>(resultList, pageable, totalCount);
	}

}
