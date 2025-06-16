package com.festo.backend.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    private static final String DATA_DIR = "./data";

    @Bean
    CommandLineRunner initDatabase() {
        return args -> {
            try {
                Path dataPath = Paths.get(DATA_DIR);
                if (!Files.exists(dataPath)) {
                    Files.createDirectories(dataPath);
                    System.out.println("Diretório de dados criado em: " + DATA_DIR);
                } else {
                    System.out.println("Diretório de dados já existe: " + DATA_DIR);
                }
            } catch (IOException e) {
                System.err.println("Erro ao criar diretório de dados: " + e.getMessage());
            }

            System.out.println("Backend Festo iniciado com sucesso!");
        };
    }
}