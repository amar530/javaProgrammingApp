import java.util.Scanner;
public class PrimeChecking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean prime=isPrime(number);
		System.out.println("number "+number+" is prime :"+prime);
	}
	private static boolean isPrime(int number) {
		boolean isSame=true;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
				isSame=false;
		}
		return isSame;
	}
}
