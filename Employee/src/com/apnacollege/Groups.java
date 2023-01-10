package com.apnacollege;

public class Groups {
    Employee[] employees;
    private int counter;
    public Groups(){
        counter=0;
        employees=new Employee[10];
    }
    public void EmployeeAdd(){
        employees[counter]=new Employee();
        employees[counter].read();

        counter++;
    }
    public int getCounter(){
        return counter;
    }
    public void Display(){
        for (int i=0;i<counter;i++){
            System.out.println(employees[i].toString());
        }
    }
}
