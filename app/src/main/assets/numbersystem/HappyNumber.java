import java.util.Scanner;
public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean happyNumber=isHappyNumber(number);
		System.out.println(" Number "+number+" is happyNumber:"+happyNumber);
	}
	private static boolean isHappyNumber(int number) {
		boolean isSame=false;
		while(number>9){
			int sum=0;
			while(number!=0){
				int r=number%10;
				sum=sum+(r*r);
				number=number/10;
			}
			number=sum;
		}
		if(number==1||number==7)
			isSame=true;
		return isSame;
	}
}
