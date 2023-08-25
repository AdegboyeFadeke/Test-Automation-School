package Tasks;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner simpleInterest = new Scanner(System.in);
        System.out.println("Welcome to simple Interest calculator app, let us help you calculate your interests.");
        System.out.println("Please input your details");
//           A = P (1 + rt)
//        A	=	final amount
//        P	=	initial principal balance
//        r	=	annual interest rate
//        t	=	time (in years)
        short annualInterestRate = simpleInterest.nextShort();
        short timeInYears = simpleInterest.nextShort();
        int amount =  1 + annualInterestRate % 100 * timeInYears;
        System.out.println("Please input your details");
        int initialPrincipalBalance = simpleInterest.nextInt();
        int finalAmount = initialPrincipalBalance * amount;
        System.out.println("Your interest is " + finalAmount + "$");
    }
}
