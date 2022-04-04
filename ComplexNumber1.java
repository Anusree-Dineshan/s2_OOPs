import java.util.*;
public class ComplexNumber1 {
double real;
double img;
ComplexNumber1(double r,double i) {
this.real=r;
this.img=i;
}
ComplexNumber1() {}
ComplexNumber1 sum(ComplexNumber1 c1,ComplexNumber1 c2)
{
ComplexNumber1 temp=new ComplexNumber1();
temp.real=c1.real+c2.real;
temp.img=c1.img+c2.img;
return temp;
}
public static void main(String args[]) {
	Double r1,r2,i1,i2;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first complex number");
	r1=s.nextDouble();
	i1=s.nextDouble();
	System.out.println("Enter the second complex number");
	r2=s.nextDouble();
	i2=s.nextDouble();
	ComplexNumber1 c1=new ComplexNumber1(r1,i1);
	ComplexNumber1 c2=new ComplexNumber1(r2,i2);
	ComplexNumber1 temp1=new ComplexNumber1();
	temp1=temp1.sum(c1,c2);
	System.out.println("Sum is:"+temp1.real+"+i"+temp1.img);
	}
}
	