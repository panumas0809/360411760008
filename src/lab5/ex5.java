package lab5;

public class ex5 {
    public static void main(String[] args) {
        String msgl = " Hello ";
        //length();
        System.out.println(msgl.length());
        System.out.println("*"+msgl+"*");
        System.out.println("*"+msgl.trim()+"*");
        System.out.println(msgl.toUpperCase());

        //compare String
        String msg2 = "MIT421";
        String msg3 = "MIT421";
        String msg4 = "MT MIT421";
        //==
        if (msg2 == msg3)
            System.out.println("Yes");
        else  System.out.println("No");
        if (msg3 == msg4)
            System.out.println("Yas");
        else System.out.println("No");
        //equals()
        if (msg2.equals(msg3))
            System.out.println("Yes");
        else  System.out.println("No");
        if (msg3.equals(msg4))
            System.out.println("Yes");
        else  System.out.println("No");



        //compareTo()
        if (msg2.compareTo(msg3)==0)
            System.out.println("2 String are equal. ");
        else if (msg2.compareTo(msg3)>=1)
            System.out.println("msg2 more than msg3");
        else System.out.println("msg2 less than msg3");








    }//main
}//class
