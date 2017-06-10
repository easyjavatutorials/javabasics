package org.ejt.basics.java8.lambdas;

import java.lang.FunctionalInterface;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * <p>
 * List of functional interfaces provided with java8 can be found in following oracle documentation.
 * <p>
 * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
 * <p>
 * Intent: Demonstrate functional interface.
 *
 * They are good to know for learning Lambda expressions which is one of the amazing gift of java 8.
 */

@FunctionalInterface
public interface AnotherFunctionalInterface {

    void singleMethod();

    // A functional interface can have only one abstract method, if there are more than one
    // method as abstract then such interface cannot called an FunctionalInterface.
    // void secondMethod();
}