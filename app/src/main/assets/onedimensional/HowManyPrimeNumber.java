
import java.util.Scanner;

public class HowManyPrimeNumber {
	
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
	 static int countPrime(int[] a) {

		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			int d=2;
			while(d<=a[i]/2)
			{
				if(a[i]%d==1)
					count++;
				d++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		int primeNumber=countPrime(read);
		System.out.println("Number of prime digit :"+primeNumber);

	}
	

}
