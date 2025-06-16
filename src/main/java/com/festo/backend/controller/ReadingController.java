package com.festo.backend.controller;

import com.festo.backend.model.Reading;
import com.festo.backend.repository.ReadingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")  // Libera requisições de qualquer origem
@RestController
@RequestMapping("/api/readings")
public class ReadingController {

    private final ReadingRepository repository;

    public ReadingController(ReadingRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<Reading> createReading(@RequestBody Reading reading) {
        return ResponseEntity.ok(repository.save(reading));
    }

    @GetMapping
    public ResponseEntity<List<Reading>> getAllReadings() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{sensorId}")
    public ResponseEntity<List<Reading>> getReadingsBySensorId(@PathVariable String sensorId) {
        return ResponseEntity.ok(repository.findBySensorId(sensorId));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllReadings() {
        repository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
