package org.ejt.basics.java8.streams;

import org.ejt.basics.dao.Student;

import java.util.stream.IntStream;

import static org.ejt.basics.dao.StudentDAO.STUDENTS;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 */
public class NumericalStreams {

    /**
     * Avoiding boxing unboxing operations by getting intStreams over extracted property value.
     * @param args
     */
    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html
        System.out.println("Total of all student ages " + STUDENTS.stream().mapToInt(Student::getAge).sum());

        System.out.println("Avg age of student " + STUDENTS.stream().mapToInt(Student::getAge).average());

        //Since we know that our stream is not empty, we are explicitly calling getAsInt to get maximum value.
        System.out.println("Max student Age " + STUDENTS.stream().mapToInt(Student::getAge).max().getAsInt());


        System.out.println("Min Student ages " + STUDENTS.stream().mapToInt(Student::getAge).min().getAsInt());

        //Similarly There are long and Double streams as well for long and double type data.

        //
        System.out.println("Printing open range from 1,10 =======");
        IntStream.range(0,10).forEach(i -> System.out.print("  "+i));
        System.out.println("\n===================================== 10 is exclusive in range");

        System.out.println("Printing closed range from 1,10 =======");
        IntStream.rangeClosed(0,10).forEach(i -> System.out.print("  "+i));
        System.out.println("\n===================================== Last number is inclusive.");

    }

}
