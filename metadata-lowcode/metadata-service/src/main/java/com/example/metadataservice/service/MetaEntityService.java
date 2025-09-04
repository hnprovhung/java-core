package com.example.metadataservice.service;

import com.example.metadataservice.entity.MetaEntity;
import com.example.metadataservice.repository.MetaEntityRepository;
import org.springframework.stereotype.Service;

@Service
public class MetaEntityService {
    private final MetaEntityRepository repo;

    public MetaEntityService(MetaEntityRepository repo) {
        this.repo = repo;
    }

    public MetaEntity save(MetaEntity entity) {
        return repo.save(entity);
    }
}