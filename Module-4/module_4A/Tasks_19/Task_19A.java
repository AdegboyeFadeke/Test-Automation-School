package module_4A.Tasks_19;

public class Task_19A {

        // FINAL: create 3 variables of a class A, ballSize, ballColour, ballTexture.
        // and make it impossible to change the value the ballSize
        // in any method in that class
        public static void main(String[] args) {
            final int ballSize = 10;
            //ballSize = 2;
            String ballColour = "white";
            String ballTexture = "Coarse";
            System.out.println(ballColour);
        }
}
