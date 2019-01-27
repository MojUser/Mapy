package com.company;

public class User {
    int id;
    String name;

    public User( String name, String surname, int id, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    String surname;
    int age;


    @Override public int hashCode() {
        return 1;
    }
}
