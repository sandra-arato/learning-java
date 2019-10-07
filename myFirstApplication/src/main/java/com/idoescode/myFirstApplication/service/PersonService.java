package com.idoescode.myFirstApplication.service;

import com.idoescode.myFirstApplication.dao.IPersonDao;
import com.idoescode.myFirstApplication.model.Person;

public class PersonService {

    private final IPersonDao personDao;

    public PersonService(IPersonDao personDao) {
        this.personDao = personDao;
    }

    public int insertPerson(Person person) {
        return personDao.insertPerson(person);
    }

}
