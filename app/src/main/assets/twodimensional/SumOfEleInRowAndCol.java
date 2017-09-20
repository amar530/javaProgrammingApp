import java.util.Scanner;
public class SumOfEleInRowAndCol {
	static int [][] readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int r=sc.nextInt();
		System.out.println("enter the col");
		int c=sc.nextInt();
		int ar[][]=new int [r][c];
		System.out.println("enter "+ r*c+ " elements");
		for (int i=0;i<ar.length ;i++ )
		{
			for (int j=0;j<ar[i].length ;j++ )
			{
				ar[i][j]=sc.nextInt();
			}
		}
		return ar;
	}
	static void display(int a[][])
	{
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]+"("+i+","+j+")");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int ar[][]=readMat();
		System.out.println("entered matrix");
		display(ar);
		for (int i=0;i<ar.length ;i++)
		{
			int rsum=0;
			int csum=0;
			for (int j=0;j<ar.length ;j++)
			{
				rsum=rsum + ar[i][j];
				csum=csum + ar[j][i];
			}

			System.out.println(i+1+"row sum is :"+rsum);
			System.out.println(i+1+"column sum is:"+csum);
		}
	}
}

