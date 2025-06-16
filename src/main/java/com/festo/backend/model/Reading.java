package com.festo.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "readings")
@Data
public class Reading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sensorId;

    private Double sensorValue;  // Nome atualizado (não é mais "value")

    private LocalDateTime timestamp;
}