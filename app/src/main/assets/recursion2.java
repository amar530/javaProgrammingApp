import java.util.Scanner;
public class SumofNaturalNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scan.nextInt();
		
		int sum=getSum(number);
		System.out.println(sum);
	}
	private static int getSum(int number) {
		
		if(number==1)
			return 1;
		return number+getSum(number-1);
	}
}
