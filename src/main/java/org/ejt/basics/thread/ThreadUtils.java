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
 * @Intent
 */
public class ThreadUtils {
    public static void threadPrintln(String message) {
        System.out.println("Thread [" + Thread.currentThread() + "] " + message);
    }
}
