package com.generics;

public class Student<String, Course> {
    private java.lang.String name;
    private Course course;

    public Student() {
    }

    public Student(java.lang.String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public java.lang.String toString() {
        return "Student{" +
                "name=" + name +
                ", course=" + course +
                '}';
    }
}
