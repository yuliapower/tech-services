package com.example.tech.services.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ServiceResponseDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String type;

    @NotNull
    private boolean isActive;
}
