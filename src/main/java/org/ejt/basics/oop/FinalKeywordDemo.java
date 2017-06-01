package org.ejt.basics.oop;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 * Class demonstrates usage of final keyword in java which are :
 * <p>
 * - Doesn't allow value changes.
 * - Doesn't allow method definition change in subclass via overriding.
 * - Does't allow class to have sub classes in inheritance at all.
 */

public class FinalKeywordDemo {

    final int HOURS_IN_DAYS = 20;

    final String PLANET_EARTH_NAME = "EARTH";

    final String[] WEEK_DAYS_NAME = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    final String BLANK_FINAL_VARIABLE;
    final String ANOTHER_BLANK_FINAL_VARIABLE;

    final static String STATIC_BLANK_FINAL_VAR;

    static {
        STATIC_BLANK_FINAL_VAR = "some other final String value";
    }

    //Initialization block
    {
        BLANK_FINAL_VARIABLE = "some final String value";
    }

    //Blank final variable can be initialized in constructor as well.
    public FinalKeywordDemo() {
        ANOTHER_BLANK_FINAL_VARIABLE = "Again some other value.";
    }

    /**
     * Uncommenting following variables will leads to compilation error.
     */
    public void changeFinalVariableValueTest() {

//        HOURS_IN_DAYS = 30;
//        PLANET_EARTH_NAME = "MARS";
//        WEEK_DAYS_NAME = new String[]{"some", "values"};
//        BLANK_FINAL_VARIABLE = "reassigning variable..";
//        ANOTHER_BLANK_FINAL_VARIABLE = "reassigning attempt with another value";
//        STATIC_BLANK_FINAL_VAR = "Now reassigning static variable..";
    }

    public void intrestingArrayFinalBehavior() {
        WEEK_DAYS_NAME[0] = "Sunday";
        System.out.println(" Week days " + Arrays.toString(WEEK_DAYS_NAME));
    }
}


class NonFinalClass {

    public final void cannotOverridden() {
        System.out.println("You cannot override my definition");
    }

    public void canBeOverridden() {
        System.out.println("Hey any subclass can override me..");
    }
}

/**
 * This is a final class that cannot be extended.
 */
final class NoInheritenceSupported {

    public void dummyMethod() {
        System.out.println("I does nothing...");
    }
}

class MethodOverriding extends NonFinalClass {


//    public void cannotOverridden() {
//        System.out.println("Uncommeting this function/method will leads to compiler error.");
//    }

    @Override
    public void canBeOverridden() {
        System.out.println("This method is called from a subclass of NonFinalClass.");
    }
}

/**
 * Uncommenting following class will leads to compilation error.
 */

//class TryingExtendingFinal extends NoInheritenceSupported {
//
//}