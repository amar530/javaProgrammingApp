import java.util.Scanner;

public class NthSmallestNumber {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the element in the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the nth value ");
		int n=sc.nextInt();
		int h=getSmallestElement(arr,n);
		System.out.println(n+" Biggest value in the array :"+h);
		sc.close();
	}

	private static int getSmallestElement(int[] arr, int n) {
		for(int i=0;i<arr.length;i++)
		{
			int count =0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]< arr[i])
					count++;

			}

			if(count==n-1)
				return arr[i];
		}
		return 0;

	}


}
