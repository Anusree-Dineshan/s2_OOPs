class Swap
{
	public static void main(String args[])
	{
		int a,b;
		a=10;
		b=20;
		System.out.println("The numbers before swaping:"+a+" "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("The numbers after swaping:"+a+" " +b);
	}
}