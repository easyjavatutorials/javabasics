package org.ejt.basics.thread.create;

import org.ejt.basics.thread.DemoCodeUtils;
import org.ejt.basics.thread.ThreadUtils;

import java.util.concurrent.*;

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
public class CallableDemo implements Callable<Boolean> {

    public CallableDemo(long num) {
        this.num = num;
    }

    private long num;

    @Override
    public Boolean call() throws Exception {
        return DemoCodeUtils.isPrime(num);
    }

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        long primeNumberToCheck = 982451653l;
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Boolean> resultWrapper = executor.submit(new CallableDemo(primeNumberToCheck));
        Boolean result = resultWrapper.get(); //Getting result.
        ThreadUtils.threadPrintln("Number " + primeNumberToCheck + " is prime ? " + result);
        executor.shutdownNow(); //Closing thread pool executor.
    }
}
