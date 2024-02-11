import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		double i,x,n,sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x :");
		x=sc.nextInt();
		System.out.println("Enter value of n :");
		n=sc.nextInt();
		for (i=1;i<=n ;++i ) {
			sum=sum+(Math.pow(x,i)/i);
		}
		System.out.println("sum of series is: "+sum);
		}
	}