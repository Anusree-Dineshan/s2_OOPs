package s2java;
import java.util.*;
class Person{
String n,g,ad;
int ag;
Person(String n,String g,String ad,int ag){
this.n=n;
this.g=g;
this.ad=ad;
this.ag=ag;
}
}
class Empl extends Person{
int e;
String c,q;
float s;
Empl(String n,String g,String ad,int ag,int e,String c,String q,float s){
super(n,g,ad,ag);
this.e=e;
this.c=c;
this.q=q;
this.s=s;
}
}
class Teacher extends Empl{
int tid;
String sub,dep;
Teacher(String n,String g,String ad,int ag,int e,String c,String q,float s,int tid,String sub,String dep){
super(n,g,ad,ag,e,c,q,s);
this.tid=tid;
this.sub=sub;
this.dep=dep;
}

void display() {
  System.out.println("Name:"+n+"\nGender:"+g+"\nAddress:"+ad+"\nAge:"+ag+"\nEmpid:"+e+"\nCompany_name:"+c+"\nQualification:"+q+"\nSalary:"+s+"\nSubject:"+sub+"\nDepartment:"+dep+"\nTeacher_id:"+tid+"");
}

}

public class Multilevel {

public static void main(String[] args) {
String n,g,ad,c,q,sub,dep;
int ag,e,tid;
float s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Teachers");
int ch=sc.nextInt();
Teacher t[]=new Teacher[ch];
for(int i=0;i<ch;i++) {

System.out.println("\nEnter the name ");
n=sc.next();
n+=sc.nextLine();
System.out.println("Enter gender ");
g=sc.next();
g+=sc.nextLine();
System.out.println("Enter address ");
ad=sc.next();
ad+=sc.nextLine();
System.out.println("Enter age ");
ag=sc.nextInt();
System.out.println("Enter Employee id ");
e=sc.nextInt();
System.out.println("Enter Company name ");
c=sc.next();
c+=sc.nextLine();
System.out.println("Enter Qualification ");
q=sc.next();
q+=sc.nextLine();
System.out.println("Enter Salary ");
s=sc.nextFloat();
System.out.println("Enter Subject ");
sub=sc.next();
sub+=sc.nextLine();
System.out.println("Enter Department");
dep=sc.next();
dep+=sc.nextLine();
System.out.println("Enter teacher id");
tid=sc.nextInt();
t[i]=new Teacher(n,g,ad,ag,e,c,q,s,tid,sub,dep);
}
for(int i=0;i<ch;i++) {
t[i].display();
}

}

}
