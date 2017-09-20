import java.util.Scanner;
public class FabonisSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number of term");
		int term=sc.nextInt();
		int f1=0;
		int f2=1;
		int f3;
		for (int i =term;i>2; i--) {
			System.out.print(f1+" ");
			f3=f1+f2;
			f1=f2;
			f2=f3;	
		}
	}
}
