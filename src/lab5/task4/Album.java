package lab5.task4;

import java.util.ArrayList;

abstract class Album {

    private ArrayList<Song> songs = new ArrayList<>();

    abstract void addSong(Song song);

    public void removeSong(Song song){
        for (Song i : songs) {
            if(i.getName().equals(song.getName()) &&
               i.getId() == song.getId() &&
               i.getComposer().equals(song.getComposer())) {
                songs.remove(i);
            }
        }
    }

    @Override
    public String toString() {

        String k = new String();
        k = "";
        for (Song i : songs) {
            k += i.getName();
            k += ", ";
        }

        return "Album{songs=["+k+"]}";
    }

}
