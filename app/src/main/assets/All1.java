import java.util.Scanner;
public class AllInAll {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter decimal number");
		int dNumber=sc.nextInt();
		System.out.println("enter Base");
		int base=sc.nextInt();
		switch(base)
		{
		case 2:
			String binary=toBinary(dNumber);
			System.out.println("Binary Number : "+binary);
			break;
		case 8:
			String octal=toOctal(dNumber);
			System.out.println("Octal Number : "+octal);
			break;
		case 16:
			String hexa=toHexa(dNumber);
			System.out.println("Hexa Number : "+hexa);
			break;
		default:
			System.out.println("You choosed wrong base");
			break;
		}
	}
	private static String toHexa(int number) {

		String sum="";
		while(number>0)
		{
			int r=number%16;
			if(r<10)
				sum=r+sum;
			else
				sum=(char)(r+55)+sum;
			
			number=number/16;
		}
		return sum;
	}
	private static String toOctal(int dNumber) {
		String sum="";
		while(dNumber>0)
		{
			int r=dNumber%8;
			sum=r+sum;
			dNumber=dNumber/8;
		}
		
		return sum;
	}
	private static String toBinary(int number) {
		String sum=" ";
		while(number>0)
		{
			int r=number%2;
			sum=r+sum;
			number=number/2;
		}
		return sum;
	}
}
