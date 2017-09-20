import java.util.Scanner;
public class SwapFirstAndLast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String st=sc.nextLine();
		char[] ch=st.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' '&& ch[i-1]==' ')
			{
				int k=i;
				while(i+1<ch.length && ch[i+1]!=' ')
				{i++;}
				char c=ch[k];
				ch[k]=ch[i];
				ch[i]=c;
			}

		}
		st=new String(ch);// created a string object
		System.out.print(st);
		sc.close();
	}

}
