import java.util.Scanner;
public class Fabonis {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of term");
		int term=s.nextInt();
		int f=getFab(term);
		System.out.print(f+" ");
	}
	private static int getFab(int number)
	{
		if(number==1)
			return 0;
		if(number==2)
			return 1;
		return getFab(number-1)+getFab(number-2);
	}
}
