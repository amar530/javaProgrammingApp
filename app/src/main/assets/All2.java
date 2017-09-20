import java.util.Scanner;
public class AllInAll {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		 String number=sc.nextLine();
		 System.out.println("enter the base");
		 int base=sc.nextInt();
		 int decimal=fromAll(number,base);
		 System.out.println("decimal value of "+number+" w.r.t "+base+" : "+decimal);
	}
	private static int fromAll(String number, int base) {
		int sum=0;
		int p=0;
		for (int i =number.length()-1;i>=0;i--) {
			
			char ch=number.charAt(i);
			
			 if(ch>='0' && ch<='9')
				 sum=sum+(ch-48)*getPower(base, p);
			 else if(ch>='A' && ch<='Z')
				 sum=sum+(ch-55)*getPower(base,p);
			 else
				 sum=sum+(ch-87)*getPower(base, p);
			 p++;
		}
		return sum;
	}
	public static int getPower(int number, int p) {

		int pow=1;
		while(p>0)
		{
			pow=pow*number;
			p--;
		}

		return pow;
	}
}
