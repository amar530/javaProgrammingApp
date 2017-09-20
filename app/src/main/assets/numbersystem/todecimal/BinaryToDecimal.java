import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the binary number ");
		int number=sc.nextInt();
		int rs=bToDecimal(number);
		System.out.println(rs);
		sc.close();
	}
		static int power(int b,int p)
		{
			int pw=1;
			while(p>0)
			{
				pw=pw*b;
				p--;
			}
			
			return pw;
		}
	 static int bToDecimal(int n) {
		 int p=0; 
		 int sum=0;
		 while(n>0)
		 {
			 int r=n%10;
			sum=sum+r*power(2,p);
			 p++;
			n=n/10;
		 }
		return sum;
	}
}
