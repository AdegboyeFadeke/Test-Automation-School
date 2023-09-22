package Tasks_19C;

public class Class_B extends Class_A{
    String name = "Anderson";
    public static void main(String[] args) {
        Class_B object = new Class_B();
        object.printName();
    }

    public void printName(){
        System.out.println("Class A name is " + super.name);
    }

}
