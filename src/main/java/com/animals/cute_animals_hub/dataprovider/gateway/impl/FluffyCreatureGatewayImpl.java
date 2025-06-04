package com.animals.cute_animals_hub.dataprovider.gateway.impl;

import com.animals.cute_animals_hub.core.domain.FluffyCreatureDomain;
import com.animals.cute_animals_hub.core.gateway.FluffyCreatureGateway;
import com.animals.cute_animals_hub.dataprovider.entity.FluffyCreatureEntity;
import com.animals.cute_animals_hub.dataprovider.mapper.FluffyCreatureMapper;
import com.animals.cute_animals_hub.dataprovider.repository.FluffyCreatureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FluffyCreatureGatewayImpl implements FluffyCreatureGateway {

    private final FluffyCreatureRepository repository;
    private final FluffyCreatureMapper mapper;

    @Override
    public FluffyCreatureEntity saveFluffyCreatureDomain(FluffyCreatureDomain domain) {
        var entity = mapper.toEntity(domain);
        return repository.save(entity);
    }
}
