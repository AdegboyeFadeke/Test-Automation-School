package module_4A.Tasks_16B;

public class Child extends Parent{
    public static void main(String[] args) {
        Child myImplement = new Child();
        myImplement.buyGroceries();
        myImplement.makeSound();
    }

    @Override
    public void buyGroceries() {
        System.out.println("I am going shopping for Groceries");

    }

    @Override
    public void makeSound() {
        System.out.println("I can make a shout");

    }
}
