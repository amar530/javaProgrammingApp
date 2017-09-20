import java.util.Scanner;
public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the decimal number");
		int dNumber=scan.nextInt();
		display(dNumber);
	}
	private static void display(int dNumber) {
		if(dNumber>1)
			display(dNumber/8);
		System.out.print(dNumber%8+"");
	}
}
