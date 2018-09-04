package Quiz_2.Midtrem_Exam;

import java.util.Scanner;

public class JAVA_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C,D;
        do {
            System.out.print("คะแนนสอบย่อย : ");
            A = sc.nextInt();
            if (A > 20 || A < 0)
                System.out.println("กรุณากรอกคะแนนใหม่");
        }while (A > 20 || A < 0) ;
        do {
            System.out.print("คะแนนปฏิบัติ : ");
            B = sc.nextInt();
            if (B > 20 || B < 0)
                System.out.println("กรุณากรอกคะแนนใหม่");
        }while (B > 20 || B < 0) ;
        do {
            System.out.print("คะแนนสอบกลางภาค : ");
            C = sc.nextInt();
            if (C > 30 || C < 0)
                System.out.println("กรุณากรอกคะแนนใหม่");
        }while (C > 30 || C < 0) ;
        do {
            System.out.print("คะแนนสอบปลายภาค : ");
            D = sc.nextInt();
            if (D > 30 || D < 0)
                System.out.println("กรุณากรอกคะแนนใหม่");
        }while (D > 30 || D < 0) ;

        System.out.println("ผลคะแนนรวม :"+(A+B+C+D));

        if ((A+B+C+D)>=0 && (A+B+D+C)<=49){
            System.out.println("F");
        }
        else if ((A+B+C+D) >=50 &&(A+B+C+D)<=59){
            System.out.println("D");
        }
        else if ((A+B+C+D)>=60 &&(A+B+C+D)<=69){
            System.out.println("C");

        }
        else if ((A+B+C+D)>=70 && (A+B+C+D)<=79){
            System.out.println("B");
        }

        else if ((A+B+C+D)>=80 && (A+B+C+D)<=100){
            System.out.println("A");
        }
        else {
            System.out.println("กรุณากรอกคะแนนใหม่");
        }






    }//main
}//class
