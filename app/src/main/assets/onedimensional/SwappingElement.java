import java.util.Scanner;

public class SwappingElement {


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
	private static int[] swapArayElement(int[] arr) {
		for(int i=0;i<arr.length-1;i=i+2)
		{
			int t=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=t;
		}

		return arr;
	}


	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		int newArray[]=swapArayElement(read);
		System.out.println("After swapping of the array");
		display(newArray);

	}


}
