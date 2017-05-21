package org.ejt.basics.streams;

import org.ejt.basics.streams.dao.Student;

import java.util.ArrayList;

import static org.ejt.basics.streams.dao.StudentDAO.STUDENTS;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 */
public class StreamFindAndMatch {

    public static void main(String[] args) {

        System.out.println(" Is any Student present in stream..." + new ArrayList<Student>().stream().findAny().isPresent());

        //Checking if all students age on age criteria.
        System.out.println("All student ages greater equals 4 " + STUDENTS.stream().allMatch(student -> student.getAge() >= 4));
        System.out.println("All student ages greater equals 3 " + STUDENTS.stream().allMatch(student -> student.getAge() >= 3));

        /// Just any sample ... will return optional student as it might be the collection is empty.
        System.out.println("Just get any sample student." + STUDENTS.stream().findAny());

        /// Find first student (will force sequential traversal)... will return optional student as it might be the collection is empty.
        System.out.println("Find First student in Sequence " + STUDENTS.stream().findFirst());

        // Checks result of student matches with specified criteria
        System.out.println("Any student of class4 in collection ? " + STUDENTS.stream().anyMatch(student -> student.getBatch().equals("class4")));
        System.out.println("Any student of class5 in collection ? " + STUDENTS.stream().anyMatch(student -> student.getBatch().equals("class5")));


        // Checks result of no student matches with specified criteria
        System.out.println("Any student of class4 in collection ? " + STUDENTS.stream().noneMatch(student -> student.getBatch().equals("class4")));
        System.out.println("Any student of class5 in collection ? " + STUDENTS.stream().noneMatch(student -> student.getBatch().equals("class5")));


    }
}
