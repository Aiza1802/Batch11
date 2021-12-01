package string;

import java.util.Scanner;

public class ScannerPractice6 {

    public static void main(String[] args) {
        double balance = 200;
        Scanner input = new Scanner(System.in);
        System.out.println("How much is Deposit amount? please enter tne amount");
        double firstCheck = input.nextDouble();
        balance += firstCheck;

        System.out.println(" How much is Deposit amount");
        double secondCheck = input.nextDouble();
        balance +=secondCheck;
        System.out.println("How much is Deposit amount? please enter the amount");
        double thirdCheck = input.nextDouble();
        System.out.println("How much is phone? please enter the amount");
        double phone$ = input.nextDouble();
        balance -= phone$;

        System.out.println("How much is headPhone? please enter the amount");
        double headPhone$ = input.nextDouble();
        balance -= headPhone$;

        System.out.println("your final balance is "+ balance);



    }
}
