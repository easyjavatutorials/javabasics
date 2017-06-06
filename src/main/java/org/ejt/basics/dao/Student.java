package org.ejt.basics.dao;

/**
 * Author: ThinkersHive
 * <p>
 * Website : http://easyjavatutorials.in
 * Intent: Represents
 */
public class Student {

    private String name;
    private String batch;
    private Gender gender;
    private int height;
    private int age;

    public Student() {

    }

    public Student(String name, String batch, Gender gender, int height, int age) {
        this.name = name;
        this.batch = batch;
        this.gender = gender;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public static enum Gender {
        MALE, FEMALE;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                ", gender=" + gender +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
