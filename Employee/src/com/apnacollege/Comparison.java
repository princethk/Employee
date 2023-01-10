package com.apnacollege;

public class Comparison implements IdSort,SalarySort,NameSort{
    @Override
    public void SortbyID(Groups g) {
        Employee temp;
        Employee[] arr=g.employees;
        for(int i=0;i<g.getCounter()-1;i++)
        {
            for(int j=0;j<g.getCounter()-1-i;j++){
                if(arr[j].getEmployeeId()>arr[j+1].getEmployeeId()){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    @Override
    public void sortByName(Groups g){
        Employee temp;
        Employee[] arr=g.employees;
        for(int i=0;i< g.getCounter()-1;i++){
            for(int j=0;j< g.getCounter()-1-i;j++)
            {
                if(arr[j].getEmployeeName().charAt(i)>arr[j+1].getEmployeeName().charAt(i)){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    @Override
    public void SortbySalary(Groups g) {
        Employee temp;
        Employee[] arr=g.employees;
        for(int i=0;i<g.getCounter()-1;i++){
            for(int j=0;j<g.getCounter()-1-i;j++){
                if(arr[j].getSalary()>arr[j+1].getSalary()){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
