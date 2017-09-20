
import java.util.Scanner;

public class EvenOddNumber {	
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
	
	private static void display(int number[])
	{
		System.out.println("Array:");
		for (int i = 0; i < number.length; i++) {
			
			System.out.print(number[i]+" ");
		}
		System.out.println();
	}
	private static void getCount(int[] read) {
		int countEven=0;
		int countOdd=0;
		for (int i = 0; i < read.length; i++) {
			
			if(read[i]%2==0)
				countEven++;
			else
				countOdd++;
		}
		System.out.println("number of even :"+countEven);
		System.out.println("number of odd :"+countOdd);
	}
	
	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		getCount(read);
		
	}
	

}
