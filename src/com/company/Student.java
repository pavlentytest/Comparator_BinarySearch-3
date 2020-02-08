package com.company;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(Student o) {
        return this.age - o.getAge();
    }
}
