import java.util.Scanner;
public class TranposeTheMatrix {
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
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
	private static void transpose(int[][] read) {

		for (int i = 0; i < read.length; i++) {

			for (int j = i+1; j < read[i].length; j++) {

				int t=read[i][j];
				read[i][j]=read[j][i];
				read[j][i]=t;
			}
		}
	}
	public static void main(String[] args) {
		
		int ar[][]=readMat();
		System.out.println("entered matrix");
		display(ar);
		System.out.println("after transposing of the matrix");
		transpose(ar);
		display(ar);
	}
}
