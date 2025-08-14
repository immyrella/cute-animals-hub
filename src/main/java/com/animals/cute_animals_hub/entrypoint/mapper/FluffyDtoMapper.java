package com.animals.cute_animals_hub.entrypoint.mapper;

import com.animals.cute_animals_hub.core.domain.FluffyCreatureDomain;
import com.animals.cute_animals_hub.entrypoint.dto.FluffyCreatureRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FluffyDtoMapper {

    FluffyCreatureDomain toDomain(FluffyCreatureRequestDto fluffyCreatureRequestDto);

    default FluffyCreatureDomain toDomain(String name, FluffyCreatureRequestDto req) {
        var domain = toDomain(req);
        return new FluffyCreatureDomain(domain.name(), domain.species(), domain.age(), domain.description());
    }
}
