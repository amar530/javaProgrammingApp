import java.util.Scanner;

public class BiggestElement {

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
	private static int getBiggestElement(int[] read) {
		int biggestEle=0;
		for (int i = 0; i < read.length; i++) {

			biggestEle=read[0];
			if(biggestEle<=read[i])
				biggestEle=read[i];
		}

		return biggestEle;
	}

	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		int big=getBiggestElement(read);
		System.out.println("Biggest Element in the given Array :"+big);

	}

}
