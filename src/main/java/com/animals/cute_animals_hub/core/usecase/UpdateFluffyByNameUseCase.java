package com.animals.cute_animals_hub.core.usecase;

import com.animals.cute_animals_hub.core.domain.FluffyCreatureDomain;
import com.animals.cute_animals_hub.core.gateway.FluffyCreatureGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateFluffyByNameUseCase {

    private final FluffyCreatureGateway gateway;

    @CacheEvict(cacheNames = "fluffyByName", key = "#fluffyCreatureDomain.name")
    public FluffyCreatureDomain execute(FluffyCreatureDomain domain) {
        gateway.findByName(domain.name())
                .orElseThrow(() -> new IllegalArgumentException("Fluffy not found: " + domain.name()));

        return gateway.update(domain);
    }
}
