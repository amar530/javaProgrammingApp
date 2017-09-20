import java.util.Scanner;
public class ReverseDiagonalELement {
	static int [] [] readMat ()
	{
		Scanner sc= new Scanner (System.in);
		System.out.println ("Enter the row");
		int r=sc.nextInt ();
		System.out.println("enter the colom");
		int c=sc.nextInt ();
		int ar [][] =new int[r][c];
		System.out.println ("enter "+r*c+" Elements");
		for (int i=0; i<ar.length; i++)
		{
			for (int j=0; j<ar[i].length; j++)
			{
				ar[i] [j] =sc.nextInt ();
			}
		}
		return ar;
	}
	static void display (int a [] [])
	{
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				System.out.print (a[i][j]+"  ");
			}
			System.out.println ();
		}
	}
	private static int[][] reverseDiagnolElement(int a[][]){
		int n=a.length;
		for(int i=0;i<n/2;i++){
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j ){
					int t=a[i][j];
					a[i][j]=a[n-1-i][n-1-j];
					a[n-1-i][n-1-j]=t;
				}
				if(i+j==n-1){
					int t=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=t;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int ar1 [] []=readMat();
		display (ar1);
		System.out.println("After rever diagonaly matrix will be ");
		int newMat[][]=reverseDiagnolElement(ar1);
		display(newMat);
	}


}
