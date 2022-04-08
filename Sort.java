package s2java;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int n1,i,ch;
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n1=read.nextInt();
		System.out.println("Enter the values");
		String[]arr=new String[n1];
			for(i=0;i<n1;i++)
			{
				arr[i]=read.next();
			}
			do
			{
				System.out.println("1-With Sort Function\n2-Without Function\n3-Exit");
				System.out.println("Enter Your Choice");
				
				ch=read.nextInt();
				switch(ch)
				{
				case 1:Arrays.sort(arr);
					   for(i=0;i<n1;i++)
					   {
						   System.out.println(arr[i]+" ");
					   }
					   break;
				case 2:for(i=0;i<n1;i++) {
							for(int j=i+1;j<n1;j++) {
								if(arr[i].compareTo(arr[j])>0) {
									String temp=new String();
									temp=arr[i];
									arr[i]=arr[j];
									arr[j]=temp;
								}
							}
						}
								System.out.println("Sorted String is:");
								for(i=0;i<n1;i++) {
									System.out.println(arr[i]+" ");
								
				            }
				     break;
				case 3:System.out.println("Exiting...");
					System.exit(0);
				default:System.out.println("Invalid Choice");
				break;
				       
				}
				
			}
			while(ch!=4);
		
	}

}
