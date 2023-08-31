package Tasks_12A;

import Tasks_12B.Class_B;

public class Class_A {
    public static void main(String[] args) {
//           Create two packages. in each of the packages create one class each Class A
//        and Class B. create a method in class A that can be accessed anywhere in that
//        project and create a method in Class B that can only be accessed within a class.

                Class_A access = new Class_A();
                access.Class_AMethods();
//        Class_B secret = new Class_B();
//        secret.Class_BMethods();
    }
    public void Class_AMethods (){
        System.out.println("This is a method");
    }
}
