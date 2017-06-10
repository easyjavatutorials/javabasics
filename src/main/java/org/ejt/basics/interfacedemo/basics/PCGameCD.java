package org.ejt.basics.interfacedemo.basics;

import java.util.List;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 */
public class PCGameCD implements CompactDisk {

    String name;
    byte[] data;

    public PCGameCD(String name, byte[] data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public List<String> playList() {
        //Generally exceptions are thrown here, but to keep example simple we are just printing out data...
        System.out.println("ERROR :: There are no playlist to return. You should access data directly.");
        return null;
    }

    @Override
    public void playTrack(int trackIndex) {
        //Generally exceptions are thrown here, but to keep example simple we are just printing out data...
        System.out.println("ERROR :: There are no tracks to play. You should access data directly.");
    }

    @Override
    public byte[] data() {
        return "This is some game data stored in your compact disk".getBytes();
    }
}
