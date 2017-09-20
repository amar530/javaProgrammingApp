import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year to check ");
		int year=sc.nextInt();
		if(year%4==0)
			System.out.println("year "+year+" is leap year");
		else
			System.out.println("year "+year+" is not leap year");
	}
}
