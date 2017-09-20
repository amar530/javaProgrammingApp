import java.util.Scanner;
public class NaturalNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the target");
		int trg=scan.nextInt();
		
		display(trg);
	}
	private static void display(int n)
	{
		if(n>1)
			display(n-1);
		System.out.print(n+" ");
	}
}
