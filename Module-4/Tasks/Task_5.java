package Tasks;

public class Task_5 {
    public static void main(String[] args) {
        int number = 20;
//        System.out.println(number%3 );
        if(number%3 == 0){
            System.out.println("Buzz");
        } else if (number%5 == 0) {
            System.out.println("Fizz");

        } else if (number%3 == 0 && number%5 == 0) {
            System.out.println("BuzzFizz");
        }
    }
}
