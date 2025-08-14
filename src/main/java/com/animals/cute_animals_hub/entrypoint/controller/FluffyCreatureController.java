package com.animals.cute_animals_hub.entrypoint.controller;

import com.animals.cute_animals_hub.core.domain.FluffyCreatureDomain;
import com.animals.cute_animals_hub.core.usecase.GetFluffyByNameUseCase;
import com.animals.cute_animals_hub.core.usecase.RegisterFluffyUseCase;
import com.animals.cute_animals_hub.core.usecase.UpdateFluffyByNameUseCase;
import com.animals.cute_animals_hub.entrypoint.dto.FluffyCreatureRequestDto;
import com.animals.cute_animals_hub.entrypoint.mapper.FluffyDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fluffy-creatures")
@RequiredArgsConstructor
public class FluffyCreatureController {

    private final RegisterFluffyUseCase registerFluffyUseCase;
    private final GetFluffyByNameUseCase getFluffyByNameUseCase;
    private final UpdateFluffyByNameUseCase updateFluffyByNameUseCase;
    private final FluffyDtoMapper fluffyDtoMapper;

    @PostMapping
    public ResponseEntity<Void> register(@RequestBody FluffyCreatureRequestDto request) {
        var domain = fluffyDtoMapper.toDomain(request);
        registerFluffyUseCase.registerFluffy(domain);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{name}")
    public ResponseEntity<FluffyCreatureDomain> getByName(@PathVariable String name) {
        var creature = getFluffyByNameUseCase.execute(name);
        return ResponseEntity.ok(creature);
    }

    @PutMapping("/{name}")
    public ResponseEntity<FluffyCreatureDomain> update(@PathVariable String name,
                                                       @RequestBody FluffyCreatureRequestDto request) {
        var domain = fluffyDtoMapper.toDomain(name, request);
        var updated = updateFluffyByNameUseCase.execute(domain);
        return ResponseEntity.ok(updated);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello 🐾");
    }
}