package string;

import java.util.Scanner;

public class ScannerPractice4 {

    //Ask user to enter an integer number
    //We will find out if this is an even number or not
    //Input is 7
    //Output 7 is even number false
    //Input is 8
    //Output 8 is even number true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int number = scanner.nextInt();
        // If remainder with two gives 0 this number will be even
        // Other wise it is odd
        boolean isEven = number%2 == 0;
        System.out.println(number+" is even number "+isEven);

        //Ask user enter two integer number
        //First integer you provide should be bigger the second one
        //we will print out true
        //if second number bigger than the first number
        //we will print out false

        System.out.println("Please enter the integer but smaller than first one");


        boolean firstNumber = false;
        boolean isFirstBigger = firstNumber;

        int secondNumber = scanner.nextInt();

        System.out.println(isFirstBigger);

        // To be able to graduate from school
        //student needs
        //85% attendancy
        //80% or higher grade
        //%70 of homework
        ////create a programm for teacher
        //teacher will enter all these variables and
        //if student passes you will true for teacher
        //if student fails you will print false for teacher

        System.out.println("Please enter attendancy for student");
        int attendancy = scanner.nextInt();
        System.out.println("Please enter grade for student");
        int grade = scanner.nextInt();
        System.out.println("Please enter homework for student");
        int homework = scanner.nextInt();
        //How can I print for all of them
        boolean isGrade =grade>=80;
        boolean isAttendancy = attendancy>=85;


    }

            }

