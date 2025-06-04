package com.animals.cute_animals_hub.core.gateway;

import com.animals.cute_animals_hub.core.domain.FluffyCreatureDomain;
import com.animals.cute_animals_hub.dataprovider.entity.FluffyCreatureEntity;

public interface FluffyCreatureGateway {
    FluffyCreatureEntity saveFluffyCreatureDomain(FluffyCreatureDomain fluffyCreatureDomain);
}
