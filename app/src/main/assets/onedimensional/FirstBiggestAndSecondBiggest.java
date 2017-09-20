import java.util.Scanner;

public class FirstBiggestAndSecondBiggest {

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
	private static void getFirstBiggestAndSecondBiggest(int[] ar) {

		int fbig=ar [0];
		int sbig=ar [1];
		for (int i=1; i<ar.length; i++)
		{
			if (fbig<ar[i])
			{
				sbig=fbig;
				fbig=ar[i];
			}
			else if (sbig<ar[i])
			{
				sbig=ar[i];
			}
		}
		System.out.println ("first biggest element :"+fbig);
		System.out.println ("second biggest element :"+sbig);

	}


	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		getFirstBiggestAndSecondBiggest(read);
	}


}
