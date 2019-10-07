package com.idoescode.myFirstApplication.dao;

import com.idoescode.myFirstApplication.model.Person;

import java.util.UUID;

public interface IPersonDao {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
