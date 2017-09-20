import java.util.Scanner;
public class HowManyHappyNumber {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the limit Number");
			int limitNumber=sc.nextInt();
		int count=0;
		for(int i=0;i<=limitNumber;i++){			
			if(isHappy(i)){
				System.out.println(count+"). "+"Yeah!..: "+i+" is happy number.");	
				count++;
			}
		}
	}
	static boolean isHappy(int number){
		while(number>9){
			int sum=0;
			while(number!=0){
				int r=number%10;
				sum=sum+(r*r);
				number=number/10;
			}
			number=sum;
		}
		return number==1||number==7;		
	}
}
