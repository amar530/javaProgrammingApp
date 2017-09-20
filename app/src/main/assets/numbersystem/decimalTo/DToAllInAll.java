import java.util.Scanner;
public class DToAllInAll {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		System.out.println("enter the base");
		int base=sc.nextInt();
		display(number,base);
	}
	private static void display(int number, int base) {
		String sum="";
		while(number>0)
		{
			int r=number%base;
			if(r<10)
				sum=r+sum;
			else
				sum=(char)(r+55)+sum;
			number=number/base;
		}
		System.out.println("Required Number is "+sum);
	}
}
