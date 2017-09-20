import java.util.Scanner;
public class FromBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the binary nmber");
		int number=sc.nextInt();
			int decimal=toDecimal(number);
			System.out.println("Decimal number :"+decimal);
	}
	private static int toDecimal(int number) {
		int sum=0;
		int count=0;
		while(number>0) {
			int r = number % 10;
			sum = sum + r * getPower(2, count);
			number = number / 10;
			count++;
		}
		return sum;
	}
	public static int getPower(int number, int p) {
		int pow=1;
		while(p>0)
		{
			pow=pow*number;
			p--;
		}
		return pow;
	}
}
