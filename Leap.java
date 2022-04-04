class Leap
{
	public static void main(String args[])
	{
		int a;
		a=2001;
		if((a%4==0)&&(a%100!=0)||(a%400==0))
		{
			System.out.println("This is a leap year");
		}
		else
		{
			System.out.println("This is not a leap year");
		}
	}
}