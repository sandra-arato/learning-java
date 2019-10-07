package com.idoescode.myFirstApplication.api;

import com.idoescode.myFirstApplication.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
}
