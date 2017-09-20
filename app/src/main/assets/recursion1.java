import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scan.nextInt();
		int fact=getFact(number);
		System.out.println("Fact of number : "+fact);
	}
	private static int getFact(int number) {
		if(number==1)
			return 1;
		return number*getFact(number-1);
	}
}
