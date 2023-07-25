package lab5.task4;

public abstract class Song {

    private String name;
    private Integer id;
    private String composer;

    Song(String name1, Integer id1, String composer1) {
        this.name = name1;
        this.id = id1;
        this.composer = composer1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String toString(){
        return "Song{name=" + name + " , id= " + id + " , composer=composer}";

    }

    public abstract void addSong(Song song1);
}
