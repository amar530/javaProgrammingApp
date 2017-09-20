import java.util.Scanner;
public class ConcanatingString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the ist string");
		String st1=sc.nextLine();
		System.out.println("enter the 2nd string");
		String st2=sc.nextLine();
		String m="and";
		String s=concat(st1,st2);
		System.out.println(s);
	}

	private static String concat(String st1, String st2) {
		char[] rs=new char[st1.length()+st2.length()];

		int k=0;
		while(k<st1.length())
		{
			rs[k]=st1.charAt(k);
			k++;
		}
		int j=0;
		while(j<st2.length())
		{
			rs[k]=st2.charAt(j);
			k++;
			j++;
		}
		return new String(rs);
	}

}
