import java.util.Scanner;

public class MeanValue {

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
		scan.close();
		return a;
		
	}
	
	private static void display(int number[])
	{
		System.out.println("Array:");
		for (int i = 0; i < number.length; i++) {
			
			System.out.print(number[i]+" ");
		}
		System.out.println();
	}
	static double getMean(int[] a) {
		double s=0;
		for (int i = 0; i < a.length; i++) {

			s=s+a[i];
		}
		return s/a.length;
	}

	
	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		double mean=getMean(read);
		System.out.println("Mean :"+mean);

	}
	
}
