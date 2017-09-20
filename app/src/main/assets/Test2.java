import java.util.Scanner;
public class EvenOddCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		String check=isEvenOdd(number);
		System.out.println("Number "+number+" :"+check);
	}
	private static String isEvenOdd(int number) {
		if(number%2==0)
			return "even";
		else
			return "Odd";
	}
}
