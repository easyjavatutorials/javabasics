package org.ejt.basics.oop;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 */
public class StaticNonStaticDemo {

    public static void main(String[] args) {
        Human alice = new Human("Alice", 7, 20);
        Human chris = new Human("Chris", 14, 30);
        Human jasDev = new Human("Jasdev", 34, 78);
        // Just printing out state of all created humans.
        System.out.println(alice);
        System.out.println(chris);
        System.out.println(jasDev);
        // Now we change age of one of the human and print data again...
        alice.celebrateBirthDay();
        jasDev.eatWihoutExcercise();
        // Now we again print all human data..
        System.out.println(alice);
        System.out.println(chris);
        System.out.println(jasDev);
        // Now changing static variable values.
        Human.avgAge = 77;
        Human.avgWeightKg = 70;
        Human.avgHeightCm = 150;
        // Now again check impact of static variable value changes.
        System.out.println(alice);
        System.out.println(chris);
        System.out.println(jasDev);
    }


}


class Human {

    public static int avgAge = 75;
    public static int avgWeightKg = 80;
    public static int avgHeightCm = 140;

    private String name;
    private int age;
    private int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void celebrateBirthDay() {
        age++;
    }

    public void eatWihoutExcercise() {
        weight++;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                " || STATIC VARIABLES Avg age =" + avgAge + " avgWeightKg= " + avgWeightKg + " avgHeightCm=" + avgHeightCm + '}';
    }
}