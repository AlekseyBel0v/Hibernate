package com.belov.hibernate.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.Check;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Check(constraints = "age <= 150 and age > -1")
@Entity
public class Person {
    @EmbeddedId
    private PersonId personId;
    private String phoneNumber;
    private String cityOfLiving;

    public Person(String name, String surname, int age, String phoneNumber, String cityOfLiving) {
        personId = new PersonId(name, surname, age);
        this.phoneNumber = phoneNumber;
        this.cityOfLiving = cityOfLiving;
    }
}