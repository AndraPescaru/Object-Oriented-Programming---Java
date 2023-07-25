package lab5.task4;

import java.util.ArrayList;

public class ThrillerAlbum extends Album{

    private ArrayList<Song> list1 = new ArrayList<>();

    @Override
    void addSong(Song song) {

        boolean ok = true;


        if (song.getComposer().equals("Michael Jackson") || song.getId() % 2 == 0) {
            ok = false;
        }

        if (ok) {
            list1.add(song);
        } else {
            System.out.println("Song does not have the name of composer Michael Jackson and even Id");
        }

    }

}
