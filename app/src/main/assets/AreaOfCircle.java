import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double r=sc.nextDouble();
		double area=3.14*r*r;
		System.out.println("Area of circle having radius "+r+" is "+area);
	}
}
