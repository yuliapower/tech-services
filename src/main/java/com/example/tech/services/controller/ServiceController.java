package com.example.tech.services.controller;

import com.example.tech.services.dto.ServiceRequestDTO;
import com.example.tech.services.dto.ServiceResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/services")
@RestController
public class ServiceController {

    /**
     * Создние услуги
     * @param request
     * @return идентификатор созданной сущности
     */
    @PostMapping
    public UUID registerService(@Valid @RequestBody ServiceRequestDTO request) {
        return UUID.randomUUID();
    }

    /**
     * Редактирвоание услуги
     * @param id
     * @param request
     * @return обновленная сущность
     */
    @PutMapping(value = "/{id}")
    public ServiceResponseDTO updateService(@PathVariable("id") UUID id,
        @RequestBody ServiceRequestDTO request){
        return null;
    }

    /**
     * Получение списка услуг
     * @return список сущностей
     */
    @GetMapping
    public Set<ServiceResponseDTO> getServices(){
        return Collections.emptySet();
    }

    /**
     * Получение услуги по идентификатору
     * @param id
     * @return сущность
     */
    @GetMapping
    public ServiceResponseDTO getServiceById(@Positive @RequestParam UUID id) {
        return null;
    }
}
