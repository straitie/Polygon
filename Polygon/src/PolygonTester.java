public class PolygonTester {
    public static void main(String[] args) {
        Polygon Square = new Polygon();
        Polygon Hexagon = new Polygon(5, 3, "Hexagon");
        //Below to be edited when toString method is made.
        System.out.println("Square/Empty Constructor Test:\nSides: "+Square.getNumSides()+"\nLength of Sides: "+Square.getSideLength()
                +"\nShape Name: "+Square.getShapeType()+"\n");
        System.out.println("Hexagon/Full Constuctor Test:\nSides: "+Hexagon.getNumSides()+"\nLength of Sides: "+ Hexagon.getSideLength()
                +"\nShape Name: "+Hexagon.getShapeType()+"\n");
    }
}
