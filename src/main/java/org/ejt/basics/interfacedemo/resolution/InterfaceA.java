package org.ejt.basics.interfacedemo.resolution;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * <p>
 * Intent: Demonstrates usage of interfaces.
 */
public interface InterfaceA {

    default String message() {
        return "Message from Interface A";
    }

}
