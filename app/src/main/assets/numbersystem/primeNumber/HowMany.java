import java.util.Scanner;
public class HowMany {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int count=0;
		for (int i = 1; i <=number; i++) {
			if(isPrime(i))
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("number of prime number presenet between 1 to "+number+" is :"+count);
	}
	private static boolean isPrime(int number)
	{
		boolean isSame=true;
		for (int i = 2; i <=number/2; i++) {

			if(number%i==0)
				isSame=false;
		}
		return isSame;
	}
}
