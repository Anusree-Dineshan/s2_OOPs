package s2java;
import java.io.*;
import java.util.*;
class Area{
void area(float l)
{
System.out.println("The area of square is:"+Math.pow(l,2));
}
float area(int l,int b)
{
System.out.println("The area of rectangle is:"+l*b);
return 0;
}
void area(double r)
{
System.out.println("The area of circle is:"+3.14*r*r);
}
}


public class AreaOverload {

public static void main(String[] args) {
int b,l;
float s;
double r;
Area ar=new Area();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of the square");
    s =sc.nextFloat();
    System.out.println("Enter the length and breadth of rectangle");
    l=sc.nextInt();
    b =sc.nextInt();
System.out.println("Enter the radius");
r=sc.nextDouble();
ar.area(s);
ar.area(l,b);
ar.area(r);

               
               
}

}
