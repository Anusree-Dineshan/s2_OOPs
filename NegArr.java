package s2java;

public class NegArr {

	public static void main(String[] args) {
		try {
			int[]a=new int[-5];
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Array assigned negative size:"+e);
		}

	}

}
