import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the princle");
		int p=sc.nextInt();
		System.out.println("Enter the rate");
		double rate=sc.nextDouble();
		System.out.println("enter the time in year");
		double time =sc.nextDouble();
		double si=(p*rate*time)/100;
		System.out.println("Simple interest :"+si);
	}
}
