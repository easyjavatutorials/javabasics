package org.ejt.basics.thread;

/**
 * Created by http://easyjavatutorials.in on 12/3/16.
 * <p>
 * A place to find easy java tutorials written by developers for developers.
 * <p>
 * Released under :
 * <p>
 * Apache License 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 * <p>
 *
 * @Intent A util
 */
public class DemoCodeUtils {

    /**
     * Simply displays number of
     *
     * @param num
     */
    public static void printTable(int num) {
        ThreadUtils.threadPrintln("Computing table of number [" + num + "]");
        for (int counter = 1; counter <= 10; counter++) {
            ThreadUtils.threadPrintln("" + num + " * " + counter + " = " + counter * num);
        }
        ThreadUtils.threadPrintln("XXXX -------- Finished table printing for [" + num + "] ---------- XXXX");
    }

    /**
     * If a number is prime or not.
     * @param num
     * @return
     */
    public static boolean isPrime(long num) {
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        ThreadUtils.threadPrintln("num is " + num + " is prime " + result);
        return result;
    }
}
