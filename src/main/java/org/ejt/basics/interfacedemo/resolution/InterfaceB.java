package org.ejt.basics.interfacedemo.resolution;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 */
public interface InterfaceB {

    default String message() {
        return "Message from Interface B";
    }
}
