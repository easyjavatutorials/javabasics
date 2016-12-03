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
 * @Intent
 */
public class TableThreadExtendDemo extends Thread {

    private int num;

    public TableThreadExtendDemo(String name, int num) {
        super(name);
        this.num = num;
    }

    @Override
    public void run() {
        DemoCodeUtils.printTable(num);
    }

    public static void main(String[] args) {
        ThreadUtils.threadPrintln("Started processing.");
        Thread tableRunnableThreadDemo = new TableThreadExtendDemo("Table-Print-Thread",15);
        tableRunnableThreadDemo.start();
        ThreadUtils.threadPrintln("Exiting thread.");
    }
}
