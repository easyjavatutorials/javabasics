package org.ejt.basics.interfacedemo.resolution;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * <p>
 * Intent: Demonstrates demo of default message resolution.
 * <p>
 * Resolution 3 rules work as follows:
 * <p>
 * 1 -> If method is in class or superclass then it will be picked up first.
 * <p>
 * 2 -> Most specific type of interfaces are chosen.
 * <p>
 * 3 -> If ambiguous, (method present at same level of interface), then explicitly tell which super function to call.
 */
public class MethodResolutionDemo {

    public static void main(String[] args) {
        System.out.println("Direct Inheritance from Inteface A message : " + new DirectInterface().message());
        System.out.println("Direct Inheritance from Inteface B & C message : " + new MultiLevelInterface().message());
        System.out.println("Same level inheritance from InterfaceA & InterfaceB method B " + new SameLevelInterface().message());
        System.out.println("Same level inheritance from InterfaceA & InterfaceB method A " + new SameLevelInterfaceTwo().message());
        System.out.println("ClassInterface inheritance " + new ClassInterfaceInheritence().message());
    }
}

/**
 * Since there is only one inheritance from InterfaceA
 * <p>
 * DirectInterface class will inherit message method from InterfaceA
 */
class DirectInterface implements InterfaceA {

}

class MultiLevelInterface implements InterfaceB, InterfaceC {

}

class SameLevelInterface implements InterfaceA, InterfaceB {

    public String message() {
        return InterfaceB.super.message();
    }
}

class SameLevelInterfaceTwo implements InterfaceA, InterfaceB {

    public String message() {
        return InterfaceA.super.message();
    }
}

class ClassInterfaceInheritence extends ClassD implements InterfaceB {

}