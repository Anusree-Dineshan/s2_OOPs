class Largest
{
	public static void main(String args[])
	{
		int a,b,c;
		a=60;
		b=50;
		c=25;
		if(a>=b&&a>=c)
		{
			System.out.println("The largest number is:"+a);
		}
		else if(b>=a&&b>=c)
		{
			System.out.println("The largest number is:"+b);
		}
		else 
		{
			System.out.println("The largest number is:"+c);
		}
	}
}