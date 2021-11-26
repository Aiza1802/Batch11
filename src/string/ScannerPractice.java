package string;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        String name = "Aizada";

        System.out.println("My name is "+name);

        // creating Scanner object

        Scanner  input = new Scanner(System.in);

        System.out.println("Please enter your last name");
        String LastName = input.nextLine();

        System.out.println(LastName);
        System.out.println(LastName);

        //Task: Ask user to enter his/her city name and
        // print as: "name><LastName> you are living in <city>"

        System.out.println("Please enter your city name");
        String city = input.nextLine();


        System.out.println(name + ""+ LastName+" you are living in "+city);

        LastName = "Nur";
        System.out.println(LastName);

        System.out.println("Please enter your age");

        int age = input.nextInt();

        System.out.println(name + "your age is very good age. That is >> "+ age);
        System.out.println("Please enter your height in feet and inches(i.e: 5.1)");

        double height = input.nextDouble();

        System.out.println("your height is "+height);

        System.out.println("Please enter your address");
        input = new Scanner(System.in);
        String address = input.nextLine();
        System.out.println("Is this correct address you provided? "+address);





    }
}
