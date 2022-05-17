package s2java;
import java.util.*;
import Shapes.*;
public class PackageArea {

	public static void main(String[] args) {
		int ch,r,l,b,b1,h,a;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1-Circle\n2-Rectangle\n3-Square\n4-Triangle\n5-Exit");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter the Radius of Circle");
				   r=sc.nextInt();
				   Circle cir=new Circle(r);
				   cir.Area();
				   break;
			case 2:System.out.println("Enter the Length and Breadth of Rectangle");
				  l=sc.nextInt();
			      b=sc.nextInt();
			      Rectangle rec=new Rectangle(l,b);
			      rec.Area();
			      break;
			case 3:System.out.println("Enter the side of square");
			  a=sc.nextInt();
		      Square squ=new Square(a);
		      squ.Area();
		      break;
			case 4:System.out.println("Enter the Breadth and Height of Triangle");
			  b1=sc.nextInt();
		      h=sc.nextInt();
		      Triangle tri=new Triangle(b1,h);
		      tri.Area();
		      break;
			case 5:System.out.println("Exiting...");
			      System.exit(0);
		default:System.out.println("Invalid Choice");
		break;
		       
		}
		
	}
			   	   
	}
}

	
