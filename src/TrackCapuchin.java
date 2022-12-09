import javax.sound.midi.Track;

public class TrackCapuchin {
    private int xCoordMonkey;
    private int yCoordMonkey;
    private int xCoordFood;
    private int yCoordFood;

    public TrackCapuchin(int xFood, int yFood) {
        xCoordMonkey = 0;
        yCoordMonkey = 0;

        xCoordFood = xFood;
        yCoordFood = yFood;
    }

    public int getXCoordMonkey() {
        return xCoordMonkey;
    }

    public int getYCoordMonkey() {
        return yCoordMonkey;
    }

    public int getXCoordFood() {
        return xCoordFood;
    }

    public int getYCoordFood() {
        return yCoordFood;
    }

    public void moveMonkey(int xMovement, int yMovement) {
        xCoordMonkey += xMovement;
        yCoordMonkey += yMovement;
    }


    public double calcFoodDistance() {
        return Math.sqrt( Math.pow((xCoordFood - xCoordMonkey),2) + Math.pow((yCoordFood - yCoordMonkey), 2) );
    }


    public boolean isCloserThan(TrackCapuchin other) {
        return calcFoodDistance() < other.calcFoodDistance();
    }


}
