package lab5;

import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        myList.add("Q");
        System.out.println(myList);
        myList.add("May");
        myList.add("Mook");
        myList.add("J");
        myList.add("Swiss");
        System.out.println(myList);
        myList.add(2,"Both");
        System.out.println(myList);
        //remove
        myList.remove(4);
        System.out.println(myList);
        myList.remove("May");
        System.out.println(myList);
        //indexof()
        System.out.println(myList.indexOf("J"));
        //size
        System.out.println(myList.size());




    }//main




}//class
