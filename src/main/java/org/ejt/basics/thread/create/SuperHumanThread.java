package org.ejt.basics.thread.create;

import org.ejt.basics.thread.ThreadUtils;

/**
 * Created by thinkershive on 12/2/16.
 * <p>
 * <p>
 * Released under :
 * <p>
 * Apache License 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * @Intent Demonstrate to create thread via extending thread.
 * Introducing Thread.currentThread.
 * Introducing Thread.setName() & Thread.getName()
 * Introducing thread sleep method
 * Introducing thread interrupt method.
 *
 * Disadvantages of extending thread.
 */
public class SuperHumanThread extends Thread {

    public SuperHumanThread() {
        this.setName("SuperHeroThread");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ThreadUtils.threadPrintln("SuperHero saving earth " + i + " times.");
            try {
                // I am sleeping for 1 second.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                ThreadUtils.threadPrintln("Hu Hu ha ha ha ... SuperHero interrupt everyone else. They never themselves get interrupted.");
            }
        }
        ThreadUtils.threadPrintln(" - Enough saving earth. I need to go back to Krypton.");
    }


    /**
     * We overwritten one of the thread behavior.
     */
    @Override
    public void interrupt() {
        ThreadUtils.threadPrintln("Hu Hu ha ha ha..., I am SuperHero. I will not stop until I save the world.");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("Human Thread");
        ThreadUtils.threadPrintln("Alien attack, time to call superman.");
        SuperHumanThread superManThread = new SuperHumanThread();
        superManThread.start();
        ThreadUtils.threadPrintln("Let superman work fighting aliens, humans at same time can work upon saving ");
        for (int i = 0; i < 5; i++) {
            ThreadUtils.threadPrintln(Thread.currentThread().getName() + "Saving user life.");
            Thread.sleep(1000);
        }
        ThreadUtils.threadPrintln("Hey aliens are gone, let's ask our superhero to stop.");
        superManThread.interrupt();
        Thread.sleep(7000);
        ThreadUtils.threadPrintln("Thread exiting...");
    }
}
