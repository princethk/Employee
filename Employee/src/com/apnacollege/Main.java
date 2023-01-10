package com.apnacollege;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Groups A=new Groups();

        Scanner sc=new Scanner(System.in);
        System.out.println("How many Employees you Want To Add_________");
        int no=sc.nextInt();
        for(int i=0;i<no;i++)
        {
            A.EmployeeAdd();
        }


        System.out.println("All The Employees are_________");
        A.Display();
        Comparison s=new Comparison();
        System.out.println("Enter (1) for Sort By Employee Id (2) for sort by Employee Name (3) for Sort By Salary");
        int choice=sc.nextInt();
        if(choice==1)
        {
            Comparison C=new Comparison();
            IdSort id=C;
            id.SortbyID(A);
        }

        else if(choice==2)
        {
            Comparison C=new Comparison();
            NameSort name=C;
            name.sortByName(A);
        }

        else if(choice==3)
        {
            Comparison C=new Comparison();
            SalarySort sal=C;
            sal.SortbySalary(A);
        }
        System.out.println("After Sorting::::::");
        A.Display();
    }
}
