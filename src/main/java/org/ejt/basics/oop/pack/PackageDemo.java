package org.ejt.basics.oop.pack;

//Any import will become default import across the class,
// which means everywhere in class you can call this class without specifying full package name.

import org.ejt.basics.oop.pack.india.Alex;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * <p>
 * Intent: To demonstrate usage of package in java.
 */
public class PackageDemo {

    public static void main(String[] args) {

        // Defining different alex starts here...
        Alex alex = new Alex();
        org.ejt.basics.oop.pack.usa.Alex usaAlex = new org.ejt.basics.oop.pack.usa.Alex();
        org.ejt.basics.oop.pack.nepal.Alex nepalAlex = new org.ejt.basics.oop.pack.nepal.Alex();
        // Defining different alex starts here...
        System.out.println("========== PRINITING VARIOUS ALEX INFORMATION ===============");
        System.out.println("Default Alex Info " + alex.name());
        System.out.println("USA Alex Info " + usaAlex.name());
        System.out.println("Nepal Alex Info " + nepalAlex.name());
        System.out.println("============== XXX  ===============");
    }
}
