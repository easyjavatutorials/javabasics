package org.ejt.basics.interfacedemo.basics;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 */
public class MyComputer {

    CompactDisk compactDisk;

    public void insertDisk(CompactDisk compactDisk) {
        System.out.println("Disk " + compactDisk.name() + " inserted in My computer.");
    }

    public void showPlayList() {
        System.out.println("CD Traks are " + compactDisk.playList());
    }

    public void playTrack(int track) {
        compactDisk.playTrack(track);
    }

    public byte[] data(int track) {
        return compactDisk.data();
    }

    public void ejectDisk(int track) {
        compactDisk = null;
        System.out.println("Disk Ejected ");
    }

    public void installGame() {
        System.out.println(" Installing game by accessing data of game .. "+new String(compactDisk.data()));
    }

}
