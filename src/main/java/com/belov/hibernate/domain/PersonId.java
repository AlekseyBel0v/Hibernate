package com.belov.hibernate.domain;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonId personID = (PersonId) o;
        return age == personID.age && Objects.equals(name, personID.name) && Objects.equals(surname, personID.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}