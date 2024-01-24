package com.belov.hibernate.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Check;
import org.hibernate.annotations.IdGeneratorType;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity
@Table(name = "CUSTOMERS", schema = "netology")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "serial")
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "age", nullable = false)
    @Check(constraints = "age > 17 and age <150")
    private int age;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    public Customer() {     //конструктор ломбок не работает с билдером
    }
}