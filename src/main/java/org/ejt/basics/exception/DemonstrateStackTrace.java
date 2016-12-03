package org.ejt.basics.exception;

/**
 * RE-Created by http://easyjavatutorials.in on 12/3/16.
 *
 * A place to find easy java tutorials written by developers for developers.
 *
 * Released under :
 *
 * Apache License 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 *
 * @Intent To display JAVA default exception handling mechanism & how to read java Stack trace.
 */
public class DemonstrateStackTrace {

    public static void main(String[] args) {
        DemonstrateStackTrace demonstrateStackTrace = new DemonstrateStackTrace();
        demonstrateStackTrace.firstFunction(10);
    }

    public void firstFunction(int value) {
        validateValue(value);
    }

    public void validateValue(int value) {
        if (value < 100) {
            throw new IllegalArgumentException("Argument value should be less than 100.");
        }
    }
}
