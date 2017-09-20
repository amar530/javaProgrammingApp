import java.util.Scanner;
public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int reverse=getReverse(number);
		System.out.println("Reverse of "+number+" :"+reverse);
	}
	private static int getReverse(int number) {
		int rev=0;
		while(number>0)
		{
			int r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
		return rev;
	}
}
