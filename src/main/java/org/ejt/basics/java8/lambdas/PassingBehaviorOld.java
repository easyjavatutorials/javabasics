package org.ejt.basics.java8.lambdas;

import org.ejt.basics.dao.Student;
import org.ejt.basics.dao.StudentDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent: Demonstrates how java achieves passing behavior prior to java 8.
 * <p>
 * <p>
 * Merits : Generic logic to perform filtering and collection of qualified students.
 * <p>
 * Demerits of approach -> Too much verbose code, need to write new filter class say StudentAttendanceFilter, StudentGradeFilter etc
 * whenever we need to filter objects.
 * <p>
 * Behavior parameterization is a block of code, which changes very frequently without executing it. This block of code is later called
 * by program with delayed execution in program.
 */
public class PassingBehaviorOld {

    public static void main(String[] args) {
        List<Student> maleStudents = filterStudent(StudentDAO.STUDENTS, new MaleStudentFilter());
        System.out.println("Total male student count " + maleStudents.size());
        System.out.println("All male student data " + maleStudents);
        List<Student> femaleStudents = filterStudent(StudentDAO.STUDENTS, new FemaleStudentFilter());
        System.out.println("Total female student count " + femaleStudents.size());
        System.out.println("All female student data " + femaleStudents);

        List<Student> heightMoreThan100 = filterStudent(StudentDAO.STUDENTS, new Filter<Student>() {

            @Override
            public boolean applicable(Student student) {
                return student.getHeight() > 100;
            }
        });
        System.out.println("Student height greater than 100 count " + heightMoreThan100.size());
        System.out.println("All height wise filtered student data " + heightMoreThan100);

        /*
        Similarly one can write first division student filters where student pass percentage is greater than 60 or
        Student filter by low attendence etc.
         */


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

/**
 * Just filter passed objects of type T based upon some criteria.
 *
 * @param <T> Any type of Object.
 */
interface Filter<T> {
    public boolean applicable(T t);
}

/**
 * Returns true if student type is male.
 */
class MaleStudentFilter implements Filter<Student> {

    @Override
    public boolean applicable(Student student) {
        return student.getGender().equals(Student.Gender.MALE);
    }
}

/**
 * Returns true if student type is female.
 */
class FemaleStudentFilter implements Filter<Student> {

    @Override
    public boolean applicable(Student student) {
        return student.getGender().equals(Student.Gender.FEMALE);
    }
}
