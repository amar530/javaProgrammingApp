import java.util.Scanner;
public class HowMany {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two digit number");
		int number=sc.nextInt();
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(isSpecialTwoDigitNumber(i))
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Number of special two digit number between 1 to "+number+" is "+count);
	}
	private static boolean isSpecialTwoDigitNumber(int number) {
		boolean isSame=false;
		if((number%10)*(number/10)+(number%10)+(number/10)==number)
			isSame=true;
		return isSame;
	}
}
