class Allprime
{
	public static void main(String args[])
	{
		int n=0,i=1,j=1,count=0;
		for(i=2;i<=100;i++)
		{
	   	if(i%n==0)
	   	{
	        	count++;	        
	   	}
		i++;
		}
		if(count==2)
	      	 System.out.println(n+" is a prime number ");
		else
		System.out.println(n+" is a Not a prime number ");        
	} 
}
		