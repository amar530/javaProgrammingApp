import java.util.Scanner;
public class Octal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter decimal number");
		int dNumber=sc.nextInt();
		String oc=toOctal(dNumber);
		System.out.println("Octal number : "+oc);
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
}
