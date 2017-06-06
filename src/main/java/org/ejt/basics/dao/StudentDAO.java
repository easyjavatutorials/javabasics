package org.ejt.basics.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.ejt.basics.dao.Student.Gender.*;

/**
 * Author: ThinkersHive
 * <p>
 * AppName : SchoolBits
 * Intent:
 */
public class StudentDAO {

    /**
     * Represents 2 different batches of students.
     */
    public static final List<Student> STUDENTS;

    //Student marks just for demo purpose...
    public static final List<Integer> STUDENTS_MARKS;

    static {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Najmul", "class3", MALE, 110, 10));
        studentList.add(new Student("Mark", "class3", MALE, 120, 12));
        studentList.add(new Student("Ram", "class3", MALE, 70, 9));
        studentList.add(new Student("Shreya", "class3", FEMALE, 120, 12));
        studentList.add(new Student("Kalyani", "class3", FEMALE, 110, 7));
        studentList.add(new Student("Jasdev", "class3", MALE, 110, 7));

        studentList.add(new Student("Alex", "class4", MALE, 140, 13));
        studentList.add(new Student("Ramesh", "class4", MALE, 150, 12));
        studentList.add(new Student("Lalu", "class4", MALE, 50, 25));
        studentList.add(new Student("Rakesh", "class4", FEMALE, 120, 12));
        studentList.add(new Student("Gaurav", "class4", FEMALE, 130, 7));
        studentList.add(new Student("Surjan", "class4", MALE, 110, 7));
        studentList.add(new Student("Sherlock", "class4", MALE, 110, 4));
        STUDENTS = Collections.unmodifiableList(studentList);

        List<Integer> studentMarksList = new ArrayList<>();
        studentMarksList.add(10);
        studentMarksList.add(20);
        studentMarksList.add(30);
        studentMarksList.add(30);
        studentMarksList.add(30);
        studentMarksList.add(40);
        studentMarksList.add(50);

        STUDENTS_MARKS = Collections.unmodifiableList(studentMarksList);
    }


}
