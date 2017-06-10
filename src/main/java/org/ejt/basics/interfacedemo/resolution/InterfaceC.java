package org.ejt.basics.interfacedemo.resolution;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 */
public interface InterfaceC extends InterfaceB {

    default String message() {
        return "This is message from interface C";
    }
}
