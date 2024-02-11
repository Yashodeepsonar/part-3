import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		double i,x,sum=1,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		x=sc.nextInt();
		for (i=20;i<=2 ;i=i-2 ) {
			sum=sum+(Math.pow(x,i)/i);
		}
		System.out.println("sum of series is: "+sum);
		}
	}