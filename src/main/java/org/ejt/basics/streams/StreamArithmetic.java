package org.ejt.basics.streams;

import java.util.ArrayList;

import static org.ejt.basics.streams.dao.StudentDAO.STUDENTS_MARKS;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 */
public class StreamArithmetic {

    public static void main(String[] args) {

        System.out.println(" Is any element present " + new ArrayList<Integer>().stream().reduce(Integer::min).isPresent());

        // Sum via reduction...
        System.out.println(STUDENTS_MARKS.stream().reduce(0, (a, b) -> a + b));

        //Using already written library function for summing numbers.
        System.out.println(STUDENTS_MARKS.stream().reduce(0, Integer::sum));

        //Finding Min
        System.out.println(STUDENTS_MARKS.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b));
        System.out.println(STUDENTS_MARKS.stream().reduce(Integer.MAX_VALUE, Integer::min));

        //Finding min without providing default value, if empty stream , optional blank value will be returned.
        System.out.println(STUDENTS_MARKS.stream().reduce(Integer::min).get());

        //Finding Maximum
        System.out.println(STUDENTS_MARKS.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b));
        System.out.println(STUDENTS_MARKS.stream().reduce(Integer.MIN_VALUE, Integer::max));

        //Finding min without providing default value, if empty stream , optional blank value will be returned.
        System.out.println(STUDENTS_MARKS.stream().reduce(Integer::max).get());


    }
}
