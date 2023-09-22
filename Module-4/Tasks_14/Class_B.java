package Tasks_14;

public class Class_B {
    public static void main(String[] args) {
        Class_A square_Shapes = new Class_A();
        square_Shapes.setShape_Breath(4);
        square_Shapes.setShape_Length(4);
        int square_ShapesBreath = square_Shapes.getShape_Breath();
        int square_ShapesLength = square_Shapes.getShape_Length();
        System.out.println("The area is = " + square_ShapesBreath * square_ShapesLength);
        System.out.println("The area of a square of length: 4 and breadth 4 is 16");
    }
}
