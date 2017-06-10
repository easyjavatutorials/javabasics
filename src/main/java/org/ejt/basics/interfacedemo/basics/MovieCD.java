package org.ejt.basics.interfacedemo.basics;

import java.util.Arrays;
import java.util.List;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent: Company A MovieCD.
 */
public class MovieCD implements CompactDisk {

    private String name;
    List<String> playList;
    List<String> movieParts;

    public MovieCD(String name, List<String> playList, List<String> movieParts) {
        this.name = name;
        this.playList = playList;
        this.movieParts = movieParts;
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
        System.out.println(" Playing .... " + movieParts.get(trackIndex));
    }

    @Override
    public byte[] data() {
        //Generally exceptions are thrown here, but to keep example simple we are just printing out data...
        System.out.println("You cannot access data directly. Try using playList & playTrack to access disk content.");
        return null;
    }
}
