package com.generics;

public class Main {
    public static void main(String[] args) {
        Student<String, Course> student1 = new Student<>();
        student1.setName("student1");
        Course course1 = new Course(001, "Computer Science");
        student1.setCourse(course1);
        System.out.println(student1.toString());
    }
}
