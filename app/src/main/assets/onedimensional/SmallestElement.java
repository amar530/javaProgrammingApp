import java.util.Scanner;

public class SmallestElement {
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
	private static int getSmallestElement(int[] read) {
		int smallestElement=0;
		for (int i = 0; i < read.length; i++) {

			smallestElement=read[0];
			if(smallestElement>=read[i])
				smallestElement=read[i];
		}

		return smallestElement;
	}

	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		int small=getSmallestElement(read);
		System.out.println("Smallest Element in the given Array :"+small);

	}

}
