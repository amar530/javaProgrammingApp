import java.util.Scanner;
public class PalindromNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean pl=isPallindrom(number);
		System.out.println("Number "+number+" is pallindrom :"+pl);
	}
	private static boolean isPallindrom(int number) {
		boolean isSame=false;
		int rev=0;
		int t=number;
		while(number>0)
		{
			int r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
		if(rev==t)
			isSame=true;
		return isSame;
	}
}
