package Tasks_13;

public class Class_A {
//Create 3 different constructors of a class A. Create 3 objects of Class A in class B
// and use the 3 different constructors when creating each of the objects of class A in class B

    String testify;
    int participant;
    boolean active;

    public Class_A(String testify){
        this.testify = testify;

    }

    public Class_A(String testify, int participant) {
        this.participant = participant;
    }

    public Class_A(String testify, int participant, boolean active) {
        this.active = active;
    }

    public void printClass_A(){
        System.out.println();
    }

}
