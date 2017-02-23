package com.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by danielbutts on 2/23/17.
 */

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonRepository repository;

    public PersonController (PersonRepository repository) {
        this.repository = repository;
    }

    @PostMapping("")
    public Person create(@RequestBody Person person) {
        this.repository.save(person);
        return person;
    }

}
