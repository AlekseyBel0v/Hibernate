package com.belov.hibernate.repository;

import com.belov.hibernate.domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.type.descriptor.java.StringJavaType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Repository
public class PersonRepository {

    @PersistenceContext
    private final EntityManager entityManager;

    @Transactional
    public List<Person> getPersonsByCity(String city) {
        var query = entityManager.createQuery("select person from Person person where person.cityOfLiving = :city", Person.class);
        query.setParameter("city", city);
        List<Person> persons = new ArrayList<>();
        try {
            persons = query.getResultList();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return persons;
    }

    @Transactional
    public void createPerson(String name, String surname, int age, String phoneNumber, String cityOfLiving) {
        entityManager.persist(new Person(name, surname, age, phoneNumber, cityOfLiving));
    }
}