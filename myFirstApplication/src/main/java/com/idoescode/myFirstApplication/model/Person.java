package com.idoescode.myFirstApplication.model;

import java.util.UUID;

public class Person  {
    private final UUID id;
    private final String name;

    public Person(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
