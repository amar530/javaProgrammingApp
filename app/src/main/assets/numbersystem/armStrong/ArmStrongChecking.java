import java.util.Scanner;
public class ArmStrongChecking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean am=isArmStrong(number);
		System.out.println("number "+number+" is ArmStrong : "+am);
	}
	private static boolean isArmStrong(int number) {
		boolean isSame=false;
		int sum=0;
		int t=number;
		int countDigit=getCount(number);
		while(number>0)
		{
			int r=number%10;
			sum=sum+power(r,countDigit);
			number=number/10;
		}
		if(sum==t)
			isSame=true;
		return isSame;
	}
	private static int power(int r, int countDigit) {
		
		int pow=1;
		while(countDigit>0)
		{
			pow=pow*r;
			countDigit--;
		}
		return pow;
	}
	private static int getCount(int number) {
		
		int count=0;
		do{
			count++;
			number=number/10;
		}while(number!=0);
		
		return count;
	}
}
