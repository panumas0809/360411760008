package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3 {
    public static void main(String[] args) throws IOException {
        //using BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your name?: ");
        String name = reader.readLine();
        System.out.print("How own are you?: ");
        int age = Integer.parseInt(reader.readLine());




        //weight
        System.out.println("What is your weight?: ");
        int weight =Integer.parseInt(reader.readLine());

        //output
        System.out.println("Hello, "+name);
        System.out.println("Your are "+age+" Years old.");
        System.out.println("Your weihth "+weight);











    }//main







}//class
