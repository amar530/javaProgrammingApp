import java.util.Scanner;

public class InsertArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("For the first array ");
		int a[]=readArr();
		display(a);
		System.out.println("for the second array");
		int b[]=readArr();
		display(b);
		System.out.println("enter the index ");
		int index=sc.nextInt();
		int combineArray[]=isertArray(a,b,index);
		System.out.println("After inserting the two array new array is");
		display(combineArray);
	}

	private static int[] isertArray(int[] a, int[] b, int index) {
		
		int z[]=new int[a.length+b.length];
		int j=0;int k=0;
		for(int i=0;i<z.length;i++)
		{
			if(i==index)
			{
				while(k<b.length)
				{
					z[i]=b[k];
					i++;
					k++;
				}
			}
			z[i]=a[j];
			j++;
		}
		
		return z;
	}

	private static void display(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	private static int[] readArr() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of the array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		return a;
	}
}
