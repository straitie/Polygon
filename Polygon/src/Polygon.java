public class Polygon {

    //Variables

    private int sides;
    private double sideLength;
    private String polygon;

    //Constructors

    public Polygon() {
        sides = 3;
        sideLength = 1;
        polygon = "triangle";
    }

    public Polygon(int numSides, double lengthOfSides, String nameOfPolygon) {
        if (numSides > 2) {
            sides = numSides;
        }
        else {
            sides = 3;
        }
        if (lengthOfSides > 0) {
            sideLength = lengthOfSides;
        }
        else {
            sideLength = 1.0;
        }
        polygon = nameOfPolygon;
    }

    //Accessors

    /**
     * Returns the int number of the sides of a given Polygon object.
     * Preconditions: Polygon object must be initialized.
     * Postconditions: Returns int number of sides accessed from the Polygon object.
     * @return -the number of sides from the Polygon object
     */
    public int getNumSides() {
        return sides;
    }

    /**
     * Returns the double side length of a given Polygon object.
     * Preconditions: Polygon object must be initialized.
     * Postconditions: Returns double side length accessed from the Polygon object.
     * @return -the side length from the Polygon object
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * Returns the String shape type of a given Polygon object.
     * Preconditions: Polygon object must be initialized.
     * Postconditions: Returns String shape type accessed from the Polygon object.
     * @return -the shape type from the Polygon object
     */
    public String getShapeType() {
        return polygon;
    }
}
