import java.util.Scanner;
public class DtoOctal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the octal number ");
		int number=sc.nextInt();
		displayOctal(number);
	}
	private static void displayOctal(int number) {
		String sum="";
		int t=number;
		while(number>0)
		{
			int r=number%8;
			sum=r+sum;
			number=number/8;
		}
		System.out.println("The octal number of "+t+" :"+sum);
	}
}
