package com.mateusz;

public class Student {
    private int id;
    private String name;
    private String lastName;

    public Student(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return getName() + " " + getLastName();
    }
}
