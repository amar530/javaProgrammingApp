import java.util.Scanner;
public class HowMany {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(isStrong(i))
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("number of strong number between 1 to "+number+" is :"+count);
	}
	private static boolean isStrong(int number) {
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
