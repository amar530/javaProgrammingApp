import java.util.Scanner;

public class FisrtSmallestAndSecondSmallest {
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
	private static void getFirstsmallestAndSecondsmallest(int[] ar) {

		int fSmall=ar [0];
		int sSmall=ar [1];
		for (int i=1; i<ar.length; i++)
		{
			if (fSmall>ar[i])
			{
				sSmall=fSmall;
				fSmall=ar[i];
			}
			else if (sSmall>ar[i])
			{
				sSmall=ar[i];
			}
		}
		System.out.println ("first smallest element :"+fSmall);
		System.out.println ("second smallest element :"+sSmall);

	}


	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		getFirstsmallestAndSecondsmallest(read);
	}


}
