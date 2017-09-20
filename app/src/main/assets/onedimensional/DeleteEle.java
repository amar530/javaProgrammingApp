
import java.util.Scanner;

public class DeleteEle {

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

	private static int[] delete(int[] read, int index) {


		if(index<0 || index>read.length)
		{
			System.out.println("ArrayIndex out of bond");
			return read;
		}

		int nA[]=new int[read.length-1];
		for (int i = 0; i < nA.length; i++) {

			if(index>i)
				nA[i]=read[i];
			else
				nA[i]=read[i-1];
		}
		return nA;
	}

	public static void main(String[] args) {

		int read[]=readArray();
		display(read);
		Scanner sc=new Scanner(System.in);
		System.out.println("please specify the index from which element to be deleted");
		int index=sc.nextInt();
		int newArray[]=delete(read,index);
		System.out.println("After deleting "+index+" index");
		display(newArray);
	}
}
