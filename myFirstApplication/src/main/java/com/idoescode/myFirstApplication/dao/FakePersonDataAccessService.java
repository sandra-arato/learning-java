package com.idoescode.myFirstApplication.dao;

import com.idoescode.myFirstApplication.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccessService implements IPersonDao {
    private static List<Person> database = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        database.add(new Person(id, person.getName()))
        return 1;
    }
}
