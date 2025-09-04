package com.example.metadataservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MetaEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String version;
    private String schemaJson; // Lưu schema field, UI, i18n
}