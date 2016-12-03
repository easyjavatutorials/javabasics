package org.ejt.basics.thread.create;

import org.ejt.basics.thread.DemoCodeUtils;
import org.ejt.basics.thread.ThreadUtils;

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
 * @Intent 1. How to implement Runnable Thread.
 * <p>
 * 2. I do task but don't return anything.
 * <p>
 * 3. If you want to return anything, use my sibling Callable.
 */
public class TableRunnableDemo implements Runnable {

    private int num;

    public TableRunnableDemo(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        DemoCodeUtils.printTable(num);
    }

    public static void main(String[] args) {
        ThreadUtils.threadPrintln("Started processing.");
        TableRunnableDemo tableRunnableDemo = new TableRunnableDemo(10);
        Thread tableRunnableThreadDemo = new Thread(tableRunnableDemo,"Table-Print-Thread");
        tableRunnableThreadDemo.start();
        ThreadUtils.threadPrintln("Exiting thread.");
    }
}
