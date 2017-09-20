import java.util.Scanner;
public class EvenOddUsingString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		String a[]={"even","odd"};
		System.out.println(a[num%2]);
	}
}
