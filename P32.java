import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		int sum=1,i,no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any range :");
		no=sc.nextInt();
		System.out.println("sum of number is: ");
			for (i=1;i<=20 ;++i ) {
			if(i%2==0)
			{
				sum=sum+i;
			}
			System.out.println(+sum);
			
		}
		}
	}