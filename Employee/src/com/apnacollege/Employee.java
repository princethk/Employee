package com.apnacollege;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee ID : ");
        this.setEmployeeId(sc.nextInt());
        System.out.println("Enter Employee Name : ");
        this.setEmployeeName(sc.next());
        System.out.println("Enter The Salary : ");
        this.setSalary(sc.nextInt());
    }
}
