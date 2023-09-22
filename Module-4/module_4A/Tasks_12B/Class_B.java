package module_4A.Tasks_12B;

public class Class_B {
    public static void main(String[] args) {

//        Create two packages. in each of the packages create one class each Class A
//        and Class B. create a method in class A that can be accessed anywhere in that
//        project and create a method in Class B that can only be accessed within a class.
//        Class_A access = new Class_A();
//                access.Class_AMethods();
        Class_B secret = new Class_B();
        secret.Class_BMethods();
    }
    private void  Class_BMethods(){
        System.out.println("This is a private method");

    }

}
