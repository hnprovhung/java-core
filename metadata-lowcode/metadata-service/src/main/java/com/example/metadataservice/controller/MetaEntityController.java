package com.example.metadataservice.controller;

import com.example.metadataservice.entity.MetaEntity;
import com.example.metadataservice.service.MetaEntityService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/meta")
public class MetaEntityController {
    private final MetaEntityService service;

    public MetaEntityController(MetaEntityService service) {
        this.service = service;
    }

    @PostMapping
    public MetaEntity create(@RequestBody MetaEntity e) {
        return service.save(e);
    }
}