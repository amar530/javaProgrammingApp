import java.util.Scanner;
public class Binary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the decimal number");
		int dNumber=sc.nextInt();
		String b=toBinary(dNumber);
		System.out.println("Binary :"+b);
	}
	private static String toBinary(int number)
	{
		String sum=" ";
		while(number>0)
		{
			int r=number%2;
			sum=r+sum;
			number=number/2;
		}
		return sum;
	}
}
