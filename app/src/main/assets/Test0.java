import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int number=sc.nextInt();
		String[] st={"even","odd"};
		System.out.println("Number "+number+" is "+st[number%2]);
	}
}
