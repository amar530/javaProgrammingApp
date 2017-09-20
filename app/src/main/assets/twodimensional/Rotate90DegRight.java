import java.util.Scanner;
public class Rotate90DegRight {
	public static void main(String[] args) {
		int read[][]=readMat();
		display(read);
		transpose(read);
		reverseRow(read);
		System.out.println("After 90deg left rotating");
		display(read);
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
	private static void reverseRow(int[][] read) {

		for (int i = 0; i < read.length; i++) {
			
			for (int j = 0; j < read[i].length/2; j++) {
				
				int t=read[i][j];
				read[i][j]=read[read.length-1-i][j];
				read[read.length-1-i][j]=t;
			}
		}
	}


	private static void display(int[][] read) {

		for(int i=0;i<read.length;i++)
		{
			for(int j=0;j<read[i].length;j++)
			{
				System.out.print(read[i][j]+"   ");
			}
			System.out.println();
			System.out.println();
		}

	}

	private static int[][] readMat() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int r=sc.nextInt();
		System.out.println("enter the colom");
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		System.out.println("enter "+r*c+" element");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}

		return mat;

	}


}
