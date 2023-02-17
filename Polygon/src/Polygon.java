public class Polygon {

    //Variables

    private int sides;
    private double sideLength;
    private String polygon;
    private double perimeter;
    private double area;

    //Constructors

    public Polygon() {
        sides = 3;
        sideLength = 1;
        polygon = "Triangle";
    }

    public Polygon(int numSides, double lengthOfSides, String nameOfPolygon) {
        if (numSides > 2) {
            sides = numSides;
        }
        else {
            System.out.println("Invalid number of sides (less than 3), defaulted to 3.");
            sides = 3;
        }
        if (lengthOfSides > 0) {
            sideLength = lengthOfSides;
        }
        else {
            System.out.println("Invalid length of sides (less than or equal to 0), defaulted to 1.0.");
            sideLength = 1.0;
        }
        polygon = nameOfPolygon;
    }

    //Methods

    /**
     *
     */
    public double calculatePerimeter() {
        perimeter = sides * sideLength;
        double rounded = Math.round(perimeter * 1000) / 1000.0;
        return rounded;
    }

    /**
     *
     */
    public double calculateArea() {
        double a = sideLength / (2 * Math.tanh(180/sides));
        area = (calculatePerimeter() * a) / 2;
        double rounded = Math.round(area * 1000) / 1000.0;
        return rounded;
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

    //Mutators

    /**
     *
     */
    public void setNumSides(int numSides) {
        if (numSides > 2) {
            sides = numSides;
        }
        else {
            System.out.println("Invalid number of sides (less than 3), no change.");
            return;
        }
    }

    /**
     *
     */
    public void setSideLength(double lengthOfSides) {
        if (lengthOfSides > 0) {
            sideLength = lengthOfSides;
        }
        else {
            System.out.println("Invalid length of sides (less than or equal to 0), no change.");
            return;
        }
    }

    /**
     *
     */
    public void setShapeName(String nameOfPolygon) {
        polygon = nameOfPolygon;
    }
}
