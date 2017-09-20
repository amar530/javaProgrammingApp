import java.util.Scanner;

public class MergTwoArray {
	private static int[] readArray()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=scan.nextInt();
		
		int a[]=new int[size];
		System.out.println("enter the "+size+" elemen of the Array");
		for (int i = 0; i < a.length; i++) {
			
			a[i]=scan.nextInt();
		}
		
		return a;
		
	}
	
	static void display (int a [])
	{
		for (int i=0; i<a.length; i++)
			System.out.println (i+"------->"+a[i]);
	}
	static int[] getMerg (int ar1 [], int ar2[])
	{
		int res [] =new int [ar1.length+ar2.length];
		int j=0;
		for (int i = 0; i < ar1.length; i++, j++) 
		{
			res[j] =ar1 [i];
		}
		for (int i = 0; i < ar2.length; i++, j++) 
		{
			res[j] =ar2 [i];
		}
		
		return res;
	}
	
	public static void main (String [] args) 
	{	
		System.out.println("for the first array");
		int read1[]=readArray();
		display(read1);
		int read2[]=readArray();
		display(read2);
		System.out.println("After the merge of the two array :");
		int newArr[]=getMerg(read1,read2);
		display(newArr);
		
		
	}
}

