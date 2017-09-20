import java.util.Scanner;

public class HowManyTimeELementOccurrence {
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
	static int occurred (int a [], int ele)
	{
		int count=0;
		for (int i=0; i<a.length; i++)
		{
			if (ele==a[i])
				count++;
		}
		return count;
	}
	
	public static void main (String [] args) 
	{	Scanner sc=new Scanner(System.in);
		int read[]=readArray();
		display(read);
		System.out.println("enter the element to find occurresnce");
		int ele=sc.nextInt();
		int in=occurred (read, ele);
		if (in>=0)
			System.out.println ("your element occurred :"+in+" times");
					else
						System.out.println ("not valid");
	}
}
