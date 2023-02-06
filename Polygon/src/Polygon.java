public class Polygon {
    private int sides;
    private double sideLength;
    private String polygon;
    public Polygon() {
        sides = 4;
        sideLength = 1;
        polygon = "Square";
    }
    public Polygon(int numSides, double lengthOfSides, String nameOfPolygon) {
        sides = numSides;
        sideLength = lengthOfSides;
        polygon = nameOfPolygon;
    }
    public int getNumSides() {
        return sides;
    }
    public double getSideLength() {
        return sideLength;
    }
    public String getShapeType() {
        return polygon;
    }
}
