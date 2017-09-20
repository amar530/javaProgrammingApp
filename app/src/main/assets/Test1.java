import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int number=sc.nextInt();
		if((number/2*2)==number)
			System.out.println("Number "+number+" is Even");
		else
			System.out.println("Number "+number+" is Odd");
	}
}
