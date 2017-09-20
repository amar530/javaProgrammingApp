import java.util.Scanner;
public class OctalToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the octal number");
		int number =sc.nextInt();
		int rs=oToDecimal(number);
		System.out.println(rs);
		sc.close();
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
	 static int power(int i, int j) {
		 int pw=1;
		 while(j>0)
		 {
			 pw=pw*i;
			 j--;
		 }
		 return pw;
	}
}
