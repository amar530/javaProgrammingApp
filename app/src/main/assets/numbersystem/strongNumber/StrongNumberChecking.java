import java.util.Scanner;
public class StrongNumberChecking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean s=isStrongNumber(number);
		System.out.println("number "+number+" is strong number :"+s);
	}
	private static boolean isStrongNumber(int number) {
		boolean isSame=false;
		int sum=0;
		int t=number;
		while(number>0)
		{
			int r=number%10;
			sum=sum+factorial(r);
			number=number/10;
		}
		if(sum==t)
			isSame=true;
		return isSame;
	}
	private static int factorial(int number) {
		int fact=1;
		while(number>0)
		{
			fact=fact*number;
			number--;
		}
		return fact;
	}
}
