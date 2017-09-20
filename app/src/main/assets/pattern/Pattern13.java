public class Pattern13 {
	public static void main(String[] args) {
		for(int j=1;j<=4;j++)
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print(" "+j%2+" ");
			}
			System.out.println();
		}
	}
}
