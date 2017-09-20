import java.util.Scanner;

public class ReverseTheArray {

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
	private static void getReverse(int[] a) {
		for (int i = a.length-1; i>=0;i--) {

			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		System.out.println("Reverse of the array");
		getReverse(read);
		
	}
	
}
