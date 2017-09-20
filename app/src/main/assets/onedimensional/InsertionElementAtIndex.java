import java.util.Scanner;

public class InsertionElementAtIndex {

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

	private static int[] insert(int[] read, int ele, int index) {


		if(index>read.length || index<0)
		{
			System.out.println("Array index out of bond");
			return read;
		}
		
		int[] newArray=new int[read.length+1];
		for (int i = 0; i < read.length; i++) {
			
			if(index>i)
			{
				newArray[i]=read[i];
				
			}
			newArray[i+1]=read[i];
		}
		newArray[index]=ele;
		
		return newArray;
	}


	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element");
		int ele=sc.nextInt();
		System.out.println("please specify the index");
		int index=sc.nextInt();
		System.out.println("After inserting "+ele+" at index "+index);
		int newArray[]=insert(read,ele,index);
		display(newArray);

	}

}
