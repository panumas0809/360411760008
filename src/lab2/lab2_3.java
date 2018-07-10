package lab2;

import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input
        //Fahrenhein
        System.out.print("Fahrenheit?: ");
        double Fahrenheit = scanner.nextDouble();
        //Celsius
        double Celsius = (5.0/9.0) * (Fahrenheit -32.0);

        //output
        System.out.println("celsius is "+Celsius);




    }//main;



}//class;
