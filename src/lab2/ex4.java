package lab2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input
        //name
        System.out.print("What is your name? : ");
        String name = scanner.nextLine();
        //age
        System.out.print("How own are your?: ");
        int age = scanner.nextInt();

        //weight
        System.out.print("What is your weight?: ");
        double weight = scanner.nextDouble();

        //output
        System.out.println("Hello, "+name);
        System.out.println("Your are "+age+" Years old.");
        System.out.println("Your weihth "+weight);



    }//main;







}//class;








