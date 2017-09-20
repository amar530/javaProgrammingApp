public class Pattern19 {
	public static void main(String[] args) {
		for(int j=5;j>=1;j--)
		{
			for(int i=2;i<=j+1;i++)
			{
				System.out.print(i%2);
			}
			System.out.println();
		}
	}
}
