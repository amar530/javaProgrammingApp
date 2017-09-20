import java.util.Scanner;

public class SumOfHighestTwoContNumber {

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

	private static int getSum(int[] arr) {

		int sum=arr[0]+arr[1];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+arr[i+1]>sum)
				
				sum=arr[i]+arr[i+1];
		}
		
		return sum;
	}


	private static void display(int number[])
	{
		System.out.println("Array:");
		for (int i = 0; i < number.length; i++) {

			System.out.print(number[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		int sum=getSum(read);
		System.out.println("Highest sum of two continous element :"+sum);

	}

}
