package com.animals.cute_animals_hub.dataprovider.repository;

import com.animals.cute_animals_hub.dataprovider.entity.FluffyCreatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FluffyCreatureRepository extends JpaRepository<FluffyCreatureEntity, Integer> {
}
