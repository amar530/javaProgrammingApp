import java.util.Scanner;
public class ReverseRow {
public static void main(String[] args) {
		int read[][]=readMat();
		display(read);
		System.out.println("reverse Matrix");
		rerserMatrix(read);
		display(read);
	}

	private static void rerserMatrix(int[][] read) {
	
		for (int i = 0; i < read.length; i++) {
			
			for (int j = 0; j < read[i].length/2; j++) {
				
				int t=read[i][j];
				read[i][j]=read[read.length-1-i][j];
				read[j][read[i].length-1-i]=t;
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
