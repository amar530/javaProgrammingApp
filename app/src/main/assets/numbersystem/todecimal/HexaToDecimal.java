import java.util.Scanner;
public class HexaToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hexa decimal number");
		String number=sc.next();
		int rs=hToDecimal(number);
		System.out.println(rs);
		sc.close();
	}
	 static int hToDecimal(String n) {
		int sum=0;
		int p=0;
		for(int i=n.length()-1;i>=0;i--)
		{
			char ch=n.charAt(i);
			if(ch>=48 && ch<=57)//for 0-9 character
			sum=sum+(ch-48)*power(16,p);
			else if(ch>=97 && ch<=122)// for a-z character
				sum=sum+(ch-87)*power(16,p);
				else //for other character
					sum=sum+(ch-55)*power(16,p);
				p++;
		}
		return sum;
	}
	 static int power(int i, int j)
	 {
		 int pw=1;
		 while(j>0)
		 {
			 pw=pw*i;
			 j--;
		 }
		 return pw;
	 }
}
