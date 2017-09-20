public class Pattern15 {
	public static void main(String[] args) {
		int m=1;
		for(int j=1;j<=5;j++)
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print(" "+m%2+" ");
				m++;
			}
			System.out.println();
		}
	}

}
