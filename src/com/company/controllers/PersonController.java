package com.company.controllers;

import com.company.models.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class PersonController {
    public String personToJson(Person person) {
        Gson gson = new Gson();
        return gson.toJson(person);
    }

    public Person jsonToPerson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Person.class);
    }

    public String personsToJson(ArrayList<Person> person) {
        Gson gson = new Gson();
        return gson.toJson(person);
    }

    public ArrayList<Person> jsonToPersons(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, new TypeToken<ArrayList<Person>>() {
        }.getType());
    }
}
