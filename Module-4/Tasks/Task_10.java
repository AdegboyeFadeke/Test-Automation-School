package Tasks;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
    Task_10 methods = new Task_10();
    methods.welcomeMessage("Testify");
//Create a method that verify that visitors on the slack channel
// are coming for testify Trainings. If they write" Testify"
// then print out a  welcome messsage if not , the user should be shown
// rejection message. after creating this method,then invoke the created method
// in your main method
    }
    public void welcomeMessage (String userIdentity){
        if (userIdentity == "Testify") {
            System.out.println("Welcome to Testify, where we make you distinct");
        }else{
            System.out.println("Dear user, you have navigated to the wrong place. ");


        }
    }
}
