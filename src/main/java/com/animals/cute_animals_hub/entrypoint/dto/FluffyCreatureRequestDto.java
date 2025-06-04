package com.animals.cute_animals_hub.entrypoint.dto;

import lombok.Data;

@Data
public class FluffyCreatureRequestDto {
    private String name;
    private String species;
    private int age;
    private String description;
}
