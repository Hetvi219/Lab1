package com.example.lab1;

import java.util.IllegalFormatCodePointException;

public class Student {

    private String name;
    private int id ;
    private String course;


    public Student(String name, int id, String course) {
        setName (name);
        setId (id);
        setCourse (course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            throw new IllegalArgumentException("Name cannot be empty");
        else
            this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id>0 && id < 500 )
            this.id = id;
        else
            throw new IllegalArgumentException("ID cannot be negative");

    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        if (course.isBlank())
            throw new IllegalArgumentException("Course cannot be empty");
        else
            this.course = course;
    }

    public String toString() {
        return  name  +
                " with id " + id +
                " is in course '" + course + '\'' ;
    }
}
