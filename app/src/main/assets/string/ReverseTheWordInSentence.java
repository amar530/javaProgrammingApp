import java.util.Scanner;
public class ReverseTheWordInSentence {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String rst=" ";
		for (int i=0 ;i<ch.length;i++ )
		{
			int k=i;
			while (i<ch.length &&ch [i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while ( k<=j)
			{
				rst=rst + ch[j];
				j--;
			}
			rst=rst+' ';
		}
		System.out.println("The reserved  words of sentence  is:"+rst);
	}

}
