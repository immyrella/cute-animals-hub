package com.animals.cute_animals_hub.entrypoint.controller;

import com.animals.cute_animals_hub.core.usecase.RegisterFluffyUseCase;
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
    private final FluffyDtoMapper fluffyDtoMapper;

    @PostMapping
    public ResponseEntity<Void> register(@RequestBody FluffyCreatureRequestDto request) {
        var domain = fluffyDtoMapper.toDomain(request);
        registerFluffyUseCase.registerFluffy(domain);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello 🐾");
    }
}