import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int fact=getFactorial(number);
		System.out.println("Factorial of "+number+" : "+fact);
	}
	private static int getFactorial(int number) {
		int f=1;
		while(number>0)
		{
			f=f*number;
			number--;
		}
		return f;
	}
}
