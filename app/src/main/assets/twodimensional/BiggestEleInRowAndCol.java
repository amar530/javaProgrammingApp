import java.util.Scanner;
public class BiggestEleInRowAndCol {
	public static void main (String [] args)
	{
		Scanner sc=new Scanner (System.in);

		System.out.println ("enter the row");
		int r=sc.nextInt ();
		System.out.println("enter the col");
		int c=sc.nextInt ();
		int ar[][]=new int [r][c];
		System.out.println ("enter" + r*c + " elements");
		for (int i=0;i<ar.length ;i++ )
		{
			for (int j=0;j<ar[i].length ;j++ )
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println (" entered matrix:");
		for (int i=0;i<ar.length ;i++ )
		{
			for (int j=0; j<ar[i].length ; j++ )
			{
				System.out.print (ar[i][j]+"("+i+","+j+")");
			}
			System.out.println ();
		}

		System.out.println ();

		for (int i=0;i<ar.length ;i++ )
		{ 
			int big=ar[i][0];
			for (int j=i ; j<ar[i].length ;j++)
			{
				if(big<ar[i][j])
					big = ar[i][j];
				break;
			}
			System.out.println (i+1+"row biggest element "+big);
		}
		for (int i=0; i<ar[0].length ;i++ )
		{ 
			int big=ar[0][i];
			for (int j=0;j<ar.length ;j++ )
			{
				if (big<ar[j][i])
					big =ar[j][i];
			}
			System.out.println(i+1+"column biggest element "+big);
		}
	}
}
