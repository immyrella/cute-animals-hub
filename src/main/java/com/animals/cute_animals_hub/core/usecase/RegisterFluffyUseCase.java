package com.animals.cute_animals_hub.core.usecase;

import com.animals.cute_animals_hub.core.domain.FluffyCreatureDomain;
import com.animals.cute_animals_hub.core.gateway.FluffyCreatureGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RegisterFluffyUseCase {

    private final FluffyCreatureGateway fluffyCreatureGateway;

    public void registerFluffy(FluffyCreatureDomain fluffyCreatureDomain) {

        fluffyCreatureGateway.saveFluffyCreatureDomain(fluffyCreatureDomain);


    }
}
