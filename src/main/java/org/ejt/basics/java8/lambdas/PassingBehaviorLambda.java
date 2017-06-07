package org.ejt.basics.java8.lambdas;

import org.ejt.basics.dao.Student;
import org.ejt.basics.dao.StudentDAO;

import java.util.ArrayList;
import java.util.List;

import static org.ejt.basics.java8.lambdas.PassingBehaviorOld.filterStudent;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent: Displays passing behavior by means of lambda.
 */
public class PassingBehaviorLambda {
    public static void main(String[] args) {
        // First Lambda...
        List<Student> maleStudents = filterStudent(StudentDAO.STUDENTS, (Student student) -> student.getGender().equals(Student.Gender.MALE));
        System.out.println("Total male student count " + maleStudents.size());
        System.out.println("All male student data " + maleStudents);
        // Implicit parameter in lambda.
        List<Student> femaleStudents = filterStudent(StudentDAO.STUDENTS, (student) -> student.getGender().equals(Student.Gender.FEMALE));
        System.out.println("Total female student count " + femaleStudents.size());
        System.out.println("All female student data " + femaleStudents);

        //Assigning lambda to a variable and then passing it to function.
        Filter<Student> heightMoreThan100Lambda = (Student student) -> student.getHeight() > 100;
        List<Student> heightMoreThan100 = filterStudent(StudentDAO.STUDENTS, heightMoreThan100Lambda);
        System.out.println("Student height greater than 100 count " + heightMoreThan100.size());
        System.out.println("All height wise filtered student data " + heightMoreThan100);
    }


    /**
     * Filters out student based upon provided filter.
     *
     * @param itemsToFilter
     * @param filter
     * @return
     */
    public static List<Student> filterStudent(List<Student> itemsToFilter, Filter<Student> filter) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : StudentDAO.STUDENTS) {
            if (filter.applicable(student)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}
