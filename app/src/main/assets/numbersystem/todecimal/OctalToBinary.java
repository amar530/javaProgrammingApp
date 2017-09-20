import java.util.Scanner;
public class OctalToBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter octal number");
		int number=sc.nextInt();
		String rs=oToBinary(number);
		System.out.println(rs);
	}
	static String oToBinary(int num)
	{
		oToDecimal(num);
		
		return decimalToBinary(num);
	}
	 static int oToDecimal(int n) {
		 int p=0;
		 int sum=0;
		 while(n>0)
		 {
			 int r=n%10;
			 sum=sum+r*power(8,p);
			 p++;
			 n=n/10;
		 }
		 return sum;
	}
	  static int power(int i, int p) {
		int pw=1;
		while(p>0)
		{
			pw=pw*i;
			p--;
		}
		return pw;
	}
	static String decimalToBinary(int n)
		{	
			String sum="";
			while(n>0)
			{
				int r=n%2;
				sum=r+sum;
				n=n/2;
			}
			return sum;
	}
}
