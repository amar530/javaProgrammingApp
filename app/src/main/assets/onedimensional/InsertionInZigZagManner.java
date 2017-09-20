import java.util.Scanner;

public class InsertionInZigZagManner {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("First array is ");
		int a[]=readArr();
		display(a);
		System.out.println("second array is ");
		int b[]=readArr();
		display(b);
		int combineArray[]=getMerge(a,b);
		System.out.println("After combining the two array new Array is");
		display(combineArray);
		sc.close();
	}
	
	private static int[] getMerge(int[] a, int[] b) {
		
		int z[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		for(;j<a.length && k<b.length;i++)
		{
			z[i]=a[j];
			i++;
			z[i]=b[k];
			j++;
			k++;
		}
		while(j<a.length)
		{
			z[i]=a[j];
			i++;
			j++;
		}
		while(k<b.length)
		{
			z[i]=b[k];
			i++;
			k++;
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
		
		@SuppressWarnings("resource")
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

