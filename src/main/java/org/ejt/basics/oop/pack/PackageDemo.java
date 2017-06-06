package org.ejt.basics.oop.pack;

import org.ejt.basics.oop.pack.india.Alex;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
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
