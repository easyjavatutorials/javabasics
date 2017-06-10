package org.ejt.basics.interfacedemo.basics;

import java.util.Arrays;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 */
public class ObjectInteractionDemo {

    public static void main(String[] args) {
        //Lets say creating an object is equivalent to writing data to CD.
        CompactDisk musicCD = new MusicCD("Jagjeet Singh Gazal Songs", Arrays.asList("Tumko Dekha to", "Hoshwalo ko khabar"), Arrays.asList("Tukmo dekha to ye khayaal aaya (Actual Song)...", "Hoshwalo ko khabar kya.. (Actual Song)..."));
        CompactDisk movieCD = new MovieCD("Dangal Movie", Arrays.asList("Dangal Part 1", "Dangal Part 2"), Arrays.asList("Dangal Movie Content Part 1", "Dangal Movie Content Part 1"));
        CompactDisk gameCD = new PCGameCD("Call of Duty - World at War", "Call of Duty ActualGameContent....".getBytes());
        // And having access to instance variables means having access to actual objects in physical world.

        //Now lets try to insert cd to CD our player one by one and see

        CdPlayer cdPlayer = new CdPlayer();
        cdPlayer.insertDisk(musicCD);
        cdPlayer.showPlayList();
        cdPlayer.playTrack(1); //Suppose we pressed input of playing track 2 in remote, in List index start with 0.

        //Enough music, now time to watch Dangal movie..

        cdPlayer.insertDisk(movieCD);
        cdPlayer.showPlayList();
        cdPlayer.playTrack(1);

        // Now let us try to insert a game CD to our cd player and let's have fun..
        cdPlayer.insertDisk(gameCD);
        cdPlayer.showPlayList();
        cdPlayer.playTrack(0);

    }
}
