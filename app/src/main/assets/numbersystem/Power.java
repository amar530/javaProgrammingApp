import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		System.out.println("enter the number of power");
		int p=sc.nextInt();
		int pow=getPower(number,p);
		System.out.println("power of "+number+" w.r.t "+p+" : "+pow);
	}
	public static int getPower(int number, int p) {
		int pow=1;
		while(p>0)
		{
			pow=pow*number;
			p--;
		}
		return pow;
	}
}
