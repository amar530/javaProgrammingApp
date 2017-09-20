
import java.util.Scanner;

public class HowManyArmStrongNumber {

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
	private static int countArmStrong(int[] a) {

		int count=0;
		for (int i = 0; i < a.length; i++) {

			int t=a[i];
			int sum=0;
			int countDigit=getCount(a[i]);
			while(a[i]!=0)
			{
				int r=a[i]%10;
				sum=sum+power(r,countDigit);
				a[i]=a[i]/10;

			}
			if(t==sum)
				count++;
		}

		return count;
	}

	private static int power(int num, int base) {

		int pw=1;
		while(base>0)
		{
			pw=pw*num;
			base--;
		}
		return pw;
	}

	private static int getCount(int num) {

		int count=0;
		do{
			count++;
			num=num/10;
		}while(num!=0);
		return count;
	}


	public static void main(String[] args) {
		int read[]=readArray();
		display(read);
		int armStrong=countArmStrong(read);
		System.out.println("Number of Arm Strong Number :"+armStrong);

	}

}
