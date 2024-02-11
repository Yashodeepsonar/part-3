import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		double i,x,n,sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		x=sc.nextInt();
		System.out.println("Enter number :");
		n=sc.nextInt();
		for (i=x;i<=n ;++i ) {

			sum=sum+x;
		}
		System.out.println("sum of series is"+sum);
		}
	}