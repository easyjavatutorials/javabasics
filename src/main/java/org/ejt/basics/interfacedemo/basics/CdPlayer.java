package org.ejt.basics.interfacedemo.basics;

import java.util.Arrays;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 */
public class CdPlayer {
    private CompactDisk disk;

    public CdPlayer() {

    }

    public void insertDisk(CompactDisk disk) {
        System.out.println("\n*************************************************\n");
        this.disk = disk;
        System.out.println("Disk Inserted ..." + disk.name());
    }

    public void showPlayList() {
        System.out.println("CD Traks are " + disk.playList());
    }

    public void playTrack(int track) {
        disk.playTrack(track);
    }

    public void ejectDisk(int track) {
        disk = null;
        System.out.println("Disk Ejected ");
    }
}
