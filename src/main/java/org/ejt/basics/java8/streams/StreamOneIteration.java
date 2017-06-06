package org.ejt.basics.java8.streams;

import org.ejt.basics.dao.Student;

import java.util.stream.Stream;

import static org.ejt.basics.dao.StudentDAO.STUDENTS;

/**
 * Author: ThinkersHive
 * <p>
 * AppName : SchoolBits
 * Intent: Demostrates that stream can be consumed only once..
 */
public class StreamOneIteration {

    public static void main(String[] args) {
        Stream<Student> studentStream = STUDENTS.stream();
        //First iteration, it will print all student details..
        studentStream.forEach(student -> System.out.println("First Iteration " + student));

        //Second iteration, this will leads to exception as stream can be consumed only once.
        studentStream.forEach(student -> System.out.println("First Iteration " + student));
    }
}
