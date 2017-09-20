import java.util.Scanner;

public class HowManySpecialTwoDigitNumber {
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
	private static int getSpecialTwoDigit(int[] a) {

		int c=0;

		for (int i = 0; i < a.length; i++) {

			int s=0;
			int pro=1;
			int t=a[i];
			while(a[i]!=0)
			{
				int r=a[i]%10;

				s=s+r;
				pro=pro*r;
				a[i]=a[i]/10;
			}
			s=s+pro;
			if(t==s)
				c++;
		}
		return c;

	}

	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		int special = getSpecialTwoDigit(read);
		System.out.println("Number of special Two Digit Number :"+special);
	}


}
