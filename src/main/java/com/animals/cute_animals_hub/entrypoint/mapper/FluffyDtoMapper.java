package com.animals.cute_animals_hub.entrypoint.mapper;

import com.animals.cute_animals_hub.core.domain.FluffyCreatureDomain;
import com.animals.cute_animals_hub.entrypoint.dto.FluffyCreatureRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FluffyDtoMapper {

    FluffyCreatureDomain toDomain(FluffyCreatureRequestDto fluffyCreatureRequestDto);
}
