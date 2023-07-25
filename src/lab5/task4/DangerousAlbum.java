package lab5.task4;

import java.util.ArrayList;

public class DangerousAlbum extends Album{

    private ArrayList<Song> list  = new ArrayList<>();

    @Override
    public void addSong(Song song1) {
        boolean ok = true;

        for (int i = 2; i * i <= song1.getId(); i++) {
            if (song1.getId() % i == 0) {
                ok = false;
                break;
            }
        }

        if (ok) {
            list.add(song1);
        } else {
            System.out.println("Song does not have a prime Id");
        }
    }

}
