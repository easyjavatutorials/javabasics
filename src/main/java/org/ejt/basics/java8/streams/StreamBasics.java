package org.ejt.basics.java8.streams;

import org.ejt.basics.dao.Student;

import java.util.List;
import java.util.stream.Collectors;

import static org.ejt.basics.dao.StudentDAO.STUDENTS;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent: demonstrates how
 */
public class StreamBasics {

    public static void main(String[] args) {
        //Collecting all students in stream to List
        List<Student> students = STUDENTS.stream().collect(Collectors.toList());
        System.out.println("Student List " + students);

        //Limit only first 5 student collection.
        List<Student> fiveStudents = STUDENTS.stream().limit(5).collect(Collectors.toList());
        System.out.println("Five student " + fiveStudents);

        //Skip first 2 name and collect next 3 student.
        List<Student> skippedAndCollectedStudentNames = STUDENTS.stream().skip(2).limit(3).collect(Collectors.toList());
        System.out.println("Five student names " + skippedAndCollectedStudentNames);

        //Collecting only student names
        List<String> studentsNames = STUDENTS.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println("Collected student names " + studentsNames);

        //Filtering out students on basis of some criteria...( here we are selecting only students of class 4.
        List<Student> studentBatchList = STUDENTS.stream().filter(student -> student.getBatch().equals("class4")).collect(Collectors.toList());
        System.out.println("Class 4 Batch students " + studentBatchList);

        //Total elements count in stream..
        long totalStudentsCount = STUDENTS.stream().count();
        System.out.println("Total students in stream  are " + totalStudentsCount);


    }
}
