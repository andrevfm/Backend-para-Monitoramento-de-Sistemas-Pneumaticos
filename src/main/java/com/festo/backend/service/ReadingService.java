package com.festo.backend.service;

import com.festo.backend.model.Reading;
import com.festo.backend.repository.ReadingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReadingService {

    private final ReadingRepository repository;

    public ReadingService(ReadingRepository repository) {
        this.repository = repository;
    }

    public Reading saveReading(Reading reading) {
        return repository.save(reading);
    }

    public List<Reading> getAllReadings() {
        return repository.findAll();
    }

    public List<Reading> getReadingsBySensorId(String sensorId) {
        return repository.findBySensorId(sensorId);
    }

    public Optional<Reading> getReadingById(Long id) {
        return repository.findById(id);
    }

    public void deleteAllReadings() {
        repository.deleteAll();
    }
}
