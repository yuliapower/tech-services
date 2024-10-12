package com.example.tech.services.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

public class ServiceRequestDTO {

    @NotNull
    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    private String type;

    @NotNull
    private boolean isActive;
}
