package s2java;
import java.util.*;
interface Shape{
	void Area();
	void Perimeter();	
}
class Circle implements Shape{
	int r;
	Circle(int r){
		this.r=r;
	}
public void Area() {
	System.out.println("Area of a Circle"+3.14*r*r);
}
public void Perimeter() {
	System.out.println("Perimeter of a Circle"+2*3.14*r);
}
}
class Rect1 implements Shape{
	int l,b;
	Rect1(int l,int b){
		this.l=l;
		this.b=b;
}
	public void Area() {
		System.out.println("Area of a Rectangle"+l*b);
	}
	public void Perimeter() {
		System.out.println("Perimeter of a Rectangle"+2*l*b);
	}
}

public class AreaPeri {

	public static void main(String[] args) {
		int ch,r,l,b;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1-Circle\n2-Rectangle\n3-Exit");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter the Radius of Circle");
				   r=sc.nextInt();
				   Circle cir=new Circle(r);
				   cir.Area();
				   cir.Perimeter();
				   break;
			case 2:System.out.println("Enter the Length and Breadth of Rectangle");
			   l=sc.nextInt();
			   b=sc.nextInt();
			   Rect1 rec=new Rect1(l,b);
			   rec.Area();
			   rec.Perimeter();
			   break;
			case 3:System.out.println("Exiting...");
			System.exit(0);
		default:System.out.println("Invalid Choice");
		break;
		       
		}
		
	}
			   	   
	}
}

	
