import java.util.Scanner;
public class AllInAll {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number here");
		String number=sc.next();
		System.out.println("enter the base here");
		int base =sc.nextInt();
		int rs= convToDecimal(number,base);
		System.out.println("corrosponding conversion is " +rs);
		sc.close();
	}
	 static int convToDecimal(String n, int b) {
		 int sum=0;
		 int p=0;
		 for(int i=n.length()-1;i>=0;i--)
		 {
			 char ch=n.charAt(i);
			 if(ch>='0' && ch<='9')
				 sum=sum+(ch-48)*power(b,p);
			 else if(ch>='A' && ch<='Z')
				 sum=sum+(ch-55)*power(b,p);
			 else
				 sum =sum+(ch-87)*power(b,p);
			 p++;
		 }
		 return sum;
	}
	 static int power(int number, int power) {
		int pw=1;
		while(power>0)
		{
			pw=pw*number;
			power--;
		}
		return pw;
	}
}
