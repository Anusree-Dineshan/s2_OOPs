import java.util.*;
class Matrix{
	int a,b,u,v,i,j;
	int x[][]=new int[20][20];
	int y[][]=new int[20][20];
	int z[][]=new int[20][20];
	Scanner s=new Scanner(System.in);
	void Addition(){
		System.out.println("Enter the limit of first matrix:");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter the limit of second matrix:");
		u=s.nextInt();
		v=s.nextInt();
		if(a==u&&b==v){
			System.out.println("Enter the elements of first matrix:");
			for(i=0;i<a;i++){
			for(j=0;j<b;j++){
				x[i][j]=s.nextInt();
			}
		}
			System.out.println("Enter the elements of second matrix:");
			for(i=0;i<u;i++){
			for(j=0;j<v;j++){
				y[i][j]=s.nextInt();
			}
		}
System.out.println("The first matrix is:");
for(i=0;i<a;i++){
	for(j=0;j<b;j++){
		

		System.out.println(x[i][j]+" ");
			}
	System.out.println("");
		}

System.out.println("The second matrix is:");
for(i=0;i<u;i++){
	for(j=0;j<v;j++){
		
		
		System.out.println(y[i][j]+" ");
			}
	System.out.println("");
		}
System.out.println("The matrix after addition:");
for(i=0;i<a;i++){
	for(j=0;j<b;j++){
		z[i][j]=x[i][j]+y[i][j];
			}
		}
for(i=0;i<a;i++){	
	for(j=0;j<b;j++){
		System.out.println(z[i][j]+"\t");
			}
	System.out.println("\t");
		}
	
 		}
		else{
		System.out.println("The addition cannot be performed");
		}
	}
}
class MatrixAdd{
	public static void main(String args[]){
		Matrix m=new Matrix();
		m.Addition();
		}
}





