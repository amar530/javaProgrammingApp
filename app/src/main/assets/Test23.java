import java.util.Scanner;
public class Hexa {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter decimal number");
		int dNumber=sc.nextInt();
		String h=toHexa(dNumber);
		System.out.println("Hexadecimal number : "+h);
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
}
