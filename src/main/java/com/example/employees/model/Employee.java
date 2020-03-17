package com.example.employees.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

public class Employee {

    private UUID id;
    private String firstName;
    private String lastName;
    private int age;
    private String position;

    public Employee(
     @JsonProperty ("id") UUID id,
     @JsonProperty ("firstName") String firstName,
     @JsonProperty ("lastName") String lastName,
     @JsonProperty ("age") int age,
     @JsonProperty ("position") String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

}

