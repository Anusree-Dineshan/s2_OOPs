package s2java;
import java.io.*;
import java.util.*;
class Employeeinfo{
int eno;
String ename;
float salary;
public void input(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Employee Name:");
      this.ename = sc.nextLine();  
      System.out.println("Enter Employee Number:");
      this.eno= sc.nextInt();
      System.out.println("Enter the salary:");
      this.salary = sc.nextFloat();
  }
void display(){
       System.out.println("Employee Number: "+eno);
       System.out.println("Employee Name: "+ename);
       System.out.println("Employee Salary: "+salary);
    }
}
public class Employee{
public static void main(String[] args) {
int f=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of employees:");
int n=sc.nextInt();
Employeeinfo e[]=new Employeeinfo[n];
for(int i=0;i<n;i++) {
e[i]=new Employeeinfo();
e[i].input();
System.out.println("\n");
}
System.out.println("------Display------");
for(int i=0;i<n;i++)
{
e[i].display();
System.out.print("\n");
}
System.out.println("Enter the employee number for details:");
int empno=sc.nextInt();
for(int i=0;i<n;i++)
{
if(e[i].eno==empno)
{
   e[i].display();
System.out.print("\n");
f=1;
}
}
if(f!=1){
   System.out.println("Employee doesnot exists");
}

}

}
