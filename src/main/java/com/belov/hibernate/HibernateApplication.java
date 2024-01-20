package com.belov.hibernate;

import com.belov.hibernate.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {

    private final PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        personRepository.createPerson("Alexey", "Belov", 18, "111", "St Petersburg");
        personRepository.createPerson("Ivan", "Ivanov", 28, "222", "St Petersburg");
        personRepository.createPerson("Nickolai", "Nickolaevich", 38, "333", "Moscow");
    }
}
