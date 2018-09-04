package Quiz_2.Midtrem_Exam;

import java.util.Scanner;

public class JAVA_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input
        //number
        System.out.print("Insert Number1 : ");
        int number = scanner.nextInt();
        System.out.print("Insert Number2 : ");
        int number1 = scanner.nextInt();
        System.out.print("Insert Number3 : ");
        int number2 = scanner.nextInt();
        System.out.print("Insert Number4: ");
        int number3 = scanner.nextInt();
        System.out.print("Insert Number5 : ");
        int number4 = scanner.nextInt();
        System.out.print("Insert Number6 : ");
        int number5 = scanner.nextInt();
        System.out.print("Insert Number7 : ");
        int number6 = scanner.nextInt();
        System.out.print("Insert Number8 : ");
        int number7 = scanner.nextInt();
        System.out.print("Insert Number9 : ");
        int number8 = scanner.nextInt();
        System.out.print("Insert Number10 : ");
        int number9 = scanner.nextInt();
        int number10 = number1+number2+number3+number4+number5+number6+number7+number8+number9;

        System.out.print("หาผลรวมของจำนวนทั้งหมด");
        System.out.println(number10);
        System.out.print("หาค่าเฉลี่ยของตัวเลขทั้งหมด");
        System.out.println(number10/10);

}//main

}//class
