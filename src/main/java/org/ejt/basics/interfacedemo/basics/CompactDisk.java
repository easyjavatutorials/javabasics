package org.ejt.basics.interfacedemo.basics;

import java.util.List;

/**
 * Author: ThinkersHive
 * <p>
 * website : www.easyjavatutorials.in
 * Intent:
 * This compact disk .
 */
public interface CompactDisk {

    String name();
    /**
     * All the playlist present in the CD.
     *
     * @return
     */
    List<String> playList();

    /**
     * @param trackIndex plays song on specified index.
     */
    void playTrack(int trackIndex);

    /**
     * @return CD data in byte format so that user can do whatever it wants to do with data.
     */
    byte[] data();
}
