package com.animals.cute_animals_hub.core.usecase;

import com.animals.cute_animals_hub.core.domain.FluffyCreatureDomain;
import com.animals.cute_animals_hub.core.gateway.FluffyCreatureGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetFluffyByNameUseCase {

    private final FluffyCreatureGateway fluffyCreatureGateway;

    @Cacheable(cacheNames = "fluffyByName", key = "#name")
    public FluffyCreatureDomain execute(String name) {
        return fluffyCreatureGateway.findByName(name)
                .orElseThrow(() -> new IllegalArgumentException("Fluffy creature not found with name: " + name));
    }
}
