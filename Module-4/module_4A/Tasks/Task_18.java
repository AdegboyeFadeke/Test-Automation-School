package module_4A.Tasks;

import java.util.Scanner;

public class Task_18 {
    // Write a code that asks the user for age and that accepts the Integer value.
    // Handle the error that is encountered when the users tries to enter a name instead of age

    public static void main(String[] args) {
        int age = 23;
        Scanner yourAge = new Scanner(System.in);
        if (yourAge.hasNext("fadeke")){
            throw  new RuntimeException();
        }
        }
    }

