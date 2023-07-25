package lab5.task4;

import java.util.ArrayList;

public class BadAlbum extends Album{

    private ArrayList<Song> list3 = new ArrayList<>();

    @Override
    void addSong(Song song) {

        boolean ok = true;
        String word = new String();
        word = "";

        for (int i = song.getName().length() - 1; i >= 0; i--) {
            word += song.getName().charAt(i);

        }
        if(! word.equals(song.getName()) || song.getName().length() != 3) {
            ok = false;
        }

        if (ok) {
            list3.add(song);
        } else {
            System.out.println("Song does not have the length three or the palindromic name");
        }

    }
}
