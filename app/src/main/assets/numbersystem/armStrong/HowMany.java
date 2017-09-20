import java.util.Scanner;
public class HowMany {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		 int number=sc.nextInt();
		 int count=0;
		 for(int i=1;i<=number;i++)
		 {
			 if(getArmStrong(i))
			 {
				 System.out.print(i+" ");
				 count++;
			 }
		 }
		 System.out.println();
		 System.out.println("number of armstrong number between 1 to "+number+" is :"+count);
	}
	private static boolean getArmStrong(int i) {
		boolean isSame=false;
		int sum=0;
		int t=i;
		int countDigit=getCount(i);
		while(i>0)
		{
			int r=i%10;
			sum=sum+power(r,countDigit);
			i=i/10;
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
	private static int getCount(int i) {
		int count=0;
		do{
			count++;
			i=i/10;
		}while(i!=0);
		return count;
	}
}
