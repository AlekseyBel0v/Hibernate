package com.belov.hibernate.controller;

import com.belov.hibernate.domain.Person;
import com.belov.hibernate.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("persons/")
public class PersonController {

    private final PersonService personService;

    @RequestMapping("by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personService.getPersonsByCity(city);
    }
}
