import java.util.Scanner;
public class DecimalToHexa {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the decimal number");
		int dNumber=scan.nextInt();
		dislay(dNumber);
	}
	private static void dislay(int dNumber) {
		if(dNumber>1)
			dislay(dNumber/16);
		int r=dNumber%16;
		if(r<10)
			System.out.print(r+"");
		else
			System.out.print((char)(r+55)+"");
	}
}
