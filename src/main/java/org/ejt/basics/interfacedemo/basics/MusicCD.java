package org.ejt.basics.interfacedemo.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 */
public class MusicCD implements CompactDisk {
    String name;
    List<String> playList;
    List<String> songs;

    //Its like you are burning a new CD, and the data now cannot be changed.
    public MusicCD(String name, List<String> playList, List<String> songs) {
        this.name = name;
        this.playList = playList;
        this.songs = songs;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public List<String> playList() {
        return playList;
    }

    @Override
    public void playTrack(int trackIndex) {
        //Simplicity we just play track on index, if you want more accurate ex, you must check for valid index before playing.
        System.out.println(songs.get(trackIndex));
    }

    @Override
    public byte[] data() {
        //Generally exceptions are thrown here, but to keep example simple we are just printing out data...
        System.out.println("You cannot access data directly. Try using playList & playTrack to access disk content.");
        return null;
    }
}
