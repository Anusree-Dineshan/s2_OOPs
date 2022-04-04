import java.util.Scanner;
class Sum1
{
	public static void main(String args[])
	{
		int a,b;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=input.nextInt();
		b=input.nextInt();
		System.out.println("Sum is:"+(a+b));
	}
}