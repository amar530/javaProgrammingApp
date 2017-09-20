import java.util.Scanner;
public class SpecialTwoDigitNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		if((number%10)*(number/10)+(number%10)+(number/10)==number)
			System.out.println("yes");
		else
			System.out.println("nope");
		}
}
