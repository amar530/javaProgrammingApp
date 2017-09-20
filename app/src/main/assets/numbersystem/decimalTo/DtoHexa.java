import java.util.Scanner;
public class DtoHexa {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the decimal number");
		int number=sc.nextInt();
		displayOctal(number);
	}
	private static void displayOctal(int number) {
		String sum="";
		int t=number;
		while(number>0)
		{
			int r=number%16;
			if(r<10)
				sum=r+sum;
			else
				sum=(char)(r+55)+sum;
			number=number/16;
		}
		System.out.println("Hexa number of "+t+" :"+sum);
	}
}
