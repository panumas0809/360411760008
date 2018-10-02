package lab7;

import java.util.Scanner;

import static lab5.ex3.inputData;

public class EmployeeApp {
    public static void main (String[] args){
        Employee emp1 = new Employee("Panumas Chaichot",
                "EMP008",
                "Programmer",
                2500.00,
                "panumas08102541@gmail.com");

        System.out.println(emp1.toString());

        Employee emp2 = new Employee();
        emp2 = inputDatas(emp2);
        System.out.println(emp2.toString());


    }//main

    private static Employee inputDatas(Employee emp) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter your position");
        emp.setPosition(sc.nextLine());

        System.out.print("Enter your id");
        emp.setId(sc.nextLine());

        System.out.print("Enter your email");
        emp.setEmail(sc.nextLine());

        System.out.print("Enter your salary");
        emp.setSalary(sc.nextInt());

        return emp;

    }
}//class
