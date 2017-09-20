public class Pattern22 {
	public static void main(String[] args) {
		int m=10;
		for(int j=4;j>=1;j--)
		{
			for(int i=1;i<=j;i++)
			{
				System.out.print(" "+m+" ");
				m--;
			}
			System.out.println();
		}
	}

}
