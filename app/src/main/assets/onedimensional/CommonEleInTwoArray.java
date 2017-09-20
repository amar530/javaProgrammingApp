import java.util.Scanner;

public class CommonEleInTwoArray {

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

	private static void display (int a [])
	{
		for (int i=0; i<a.length; i++)
			System.out.println (i+"------->"+a[i]);
	}

	public static void main(String[] args) {
		System.out.println("for the first array");
		int ar1[]=readArray();
		display(ar1);
		System.out.println("for the second array");
		int ar2[]=readArray();
		display(ar2);

		System.out.println ("common elements are: ");
		for (int i=0; i<ar1.length; i++)
		{
			for (int j=0; j<ar2.length;j++ )
			{
				if (ar1 [i] ==ar2 [j])
				{
					System.out.println (ar1 [i]);
					break;
				}
			}
		}


	}

}
