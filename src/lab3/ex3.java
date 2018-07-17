package lab3;

import java.util.Scanner;

import static java.lang.System.*;

public class ex3 {
    public static void main(String[] args) {
        int testScore;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numeric test score and l will tell you the gtade:");
        testScore = scanner.nextInt();
        if (testScore<50)
            System.out.println("Your grade is F.");
        else if (testScore<55)
            System.out.println("Your grade is D.");
        else if (testScore<60)
            System.out.println("Your grade is D+.");
        else if (testScore<65)
            System.out.println("Your grade is C.");
        else if (testScore<70)
            System.out.println("Your grade is C+.");
        else if (testScore<75)
            System.out.println("Your grade is B.");
        else if (testScore<80)
            System.out.println("Your grade is B+.");
        else if (testScore<85)
            System.out.println("Your grade is A.");
        else
            System.out.println("lnvalid score.");

    }//main



}//class
