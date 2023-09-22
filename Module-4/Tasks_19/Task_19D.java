package Tasks_19;

public class Task_19D {
    static  String theName = "Umar";
    String name = "Delta";
    public static void main(String[] args) {
        // THIS https://i.imgur.com/aRkRDPa.png
        // You have a class with a method printName.
        // write a code in the printName method that will print the
        // instance member which is "Delta" and whatever name the user
        // enter when invoking the method

      Task_19D name = new Task_19D();
      name.printName("Benny");
    }

    public void printName(String name) {
        System.out.println("This is your name: " + this.name);
    }
}
