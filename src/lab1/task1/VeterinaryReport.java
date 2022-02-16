package lab1.task1;

public class VeterinaryReport {

    private int cats;
    private int dogs;

    public int getCats() {
        return cats;
    }

    public int getDogs() {
        return dogs;
    }

    public void setCats(int cats) {
        this.cats = cats;
    }

    public void setDogs(int dogs) {
        this.dogs = dogs;
    }

    public int getAnimalsCount() {
        return dogs + cats;
    }

    public void displayStatistics() {
        System.out.println("Total number of animals is " + getAnimalsCount());
    }
}
