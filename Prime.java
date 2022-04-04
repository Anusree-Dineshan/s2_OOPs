class Prime
{
	public static void main(String args[])
	{
	int count=0,i=1,n=5;
	for(i=1;i<n;i++)
	{
	   if(n%i==0)
	   {
	        count++;	        
	   }
	i++;
	}
	if(count==2)
	{
	       System.out.println(n+" is a prime number ");
	}
	else
	{
	System.out.println(n+" is a Not a prime number ");        
	}
	} 
}