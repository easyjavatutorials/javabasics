package org.ejt.basics.oop;

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

    final int HOUSE_LENGTH_IN_FEET = 1200;

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

//        HOUSE_LENGTH_IN_FEET = 1400;
//        PLANET_EARTH_NAME = "MARS";
//        WEEK_DAYS_NAME = new String[]{"some", "values"};
//        BLANK_FINAL_VARIABLE = "reassigning variable..";
//        ANOTHER_BLANK_FINAL_VARIABLE = "reassigning attempt with another value";
//        STATIC_BLANK_FINAL_VAR = "Now reassigning static variable..";
    }

    public void intrestingObjectsFinalBehavior() {
        System.out.println(" Before change " + Arrays.toString(WEEK_DAYS_NAME));
        //You cannot change memory reference, but you can change content of memory reference.
        WEEK_DAYS_NAME[0] = "Sunday";
        System.out.println(" Week days " + Arrays.toString(WEEK_DAYS_NAME));

        final FlatInfo flatInfo = new FlatInfo("Moradabad-Kundarki", 50);

        // Though we can change variable values inside final object
        flatInfo.setCurrentTenant("Arshi");
        System.out.println("Flat info for current tenant " + flatInfo);
        flatInfo.setCurrentTenant("Jasdev");
        System.out.println("Flat info for current tenant " + flatInfo);

        //once assigned, we cannot change reference of final object.

         flatInfo = new FlatInfo("Tokyo-Kohima", 50);
    }

    public static void main(String args[]) {
        new FinalKeywordDemo().intrestingObjectsFinalBehavior();
    }
}

class FlatInfo {

    private final int builidingAge;
    private final String buildingName;
    private String tenantName;

    public FlatInfo(String buildingName, int builidingAge) {
        this.buildingName = buildingName;
        this.builidingAge = builidingAge;

    }

    public void setCurrentTenant(String tenantName) {
        this.tenantName = tenantName;
    }

    @Override
    public String toString() {
        return "FlatInfo{" +
                "builidingAge=" + builidingAge +
                ", tenantName='" + tenantName + '\'' +
                '}';
    }
}

// Scenario 2 : Defining method as final

class TypeAHome {

    //// You cannot change external layout of home
    public final void govtApprovedLayout() {
        System.out.println("This has to be as per govt approval norms. No once can change it for This time homes.");
    }

    public void interiorDesign() {
        System.out.println("This is some basic suggested interior design, who just want to have their home as it is.");
    }
}

class TypeAHomeLuxuary extends TypeAHome {

//    @Override
//    public void govtApprovedLayout() {
//        System.out.println("Uncommeting this function/method will leads to compiler error.");
//    }

    @Override
    public void interiorDesign() {
        System.out.println("100 Inch TV, Couch, King Foton Bed, Royal Paint, Aquarium etc etc...");
    }
}

// Scenario 3 : Defining class as final

/**
 * This is a final class that cannot be extended.
 */
final class TajMahal {

    public void layout() {
        System.out.println("This is Tajmahal layout");
    }

    public void material() {
        System.out.println("Granite");
    }

    public void color() {
        System.out.println("Bright White.");
    }
}



/**
 * Uncommenting following class will leads to compilation error.
 */

class NewTajMahal extends TajMahal {

}

