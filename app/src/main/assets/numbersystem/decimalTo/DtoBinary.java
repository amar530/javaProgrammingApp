import java.util.Scanner;
public class DtoBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		displayBinaryNumber(number);
	}
	private static void displayBinaryNumber(int number) {
		String sum="";
		int t=number;
		while(number>0)
		{
			int r=number%2;
			sum=r+sum;
			number=number/2;
		}
		System.out.println("Binary number of "+t+" :"+sum);
	}
}
