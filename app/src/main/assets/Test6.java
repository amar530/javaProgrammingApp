import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean f=isPerfect(number);
		System.out.println("number "+number+" is perfect :"+f);
	}
	private static boolean isPerfect(int number) {
		boolean isSame=false;
		int sum=0;
		for (int i = 1; i <=number/2; i++)
		{
			if(number%i==0)
				sum=sum+i;
		}
		if(sum==number)
			isSame=true;
		return isSame;
	}
}
