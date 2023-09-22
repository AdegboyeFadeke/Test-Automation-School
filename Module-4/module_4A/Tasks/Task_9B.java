package module_4A.Tasks;

import java.util.Scanner;

public class Task_9B {
    public static void main(String[] args) {
        //Write a logic that takes in input from the user.
        // It keeps printing "try again "until the user enters "testify"
        Scanner user = new Scanner(System.in);
        String userInput = "";
        System.out.println("Welcome, type testify to exit this loop");
        while (!userInput.equalsIgnoreCase("testify")){
            System.out.println("try again");
            userInput = user.nextLine();
            continue;
        }
    }
}
