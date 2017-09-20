import java.util.Scanner;
public class FromHexa {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hexadecimal number");
		String number=sc.nextLine();
		int decimal=toDecimal(number);
		System.out.println("Decimal number : "+decimal);
	}
	private static int toDecimal(String number) {
		int sum=0;
		int count=0;
		for (int i = number.length()-1; i>=0; i--) {
			char ch=number.charAt(i);
			if(ch>=48 && ch<=57)
				sum=sum+(ch-48)*getPower(16, count);
			else if(ch>=97 && ch<=122)
				sum=sum+(ch-87)*getPower(16, count);
			else
				sum=sum+(ch-55)*getPower(16, count);
			count++;
		}
		return sum;
	}
	public static int getPower(int number, int p) {
		int pow=1;
		while(p>0)
		{
			pow=pow*number;
			p--;
		}
		return pow;
	}
}
