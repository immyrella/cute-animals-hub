package com.animals.cute_animals_hub.dataprovider.mapper;

import com.animals.cute_animals_hub.core.domain.FluffyCreatureDomain;
import com.animals.cute_animals_hub.dataprovider.entity.FluffyCreatureEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FluffyCreatureMapper {


    FluffyCreatureEntity toEntity(FluffyCreatureDomain fluffyCreatureDomain);

    FluffyCreatureDomain toDomain(FluffyCreatureEntity fluffyCreatureEntity);
}
