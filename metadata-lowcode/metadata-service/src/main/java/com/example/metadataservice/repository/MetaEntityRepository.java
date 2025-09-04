package com.example.metadataservice.repository;

import com.example.metadataservice.entity.MetaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetaEntityRepository extends JpaRepository<MetaEntity, Long> {}