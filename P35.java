import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		double i,x,n,no,sum=1,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		x=sc.nextInt();
		System.out.println("Enter number :");
		n=sc.nextInt();
		for (i=1;i<=n ;++i ) {
			no=i;
			fact=1;
			while(no<0){
			fact=fact*no;
			--no;
		}
			sum=sum+(Math.pow(x,i)/fact);
		}
		
		System.out.println("sum of series is: "+sum);
		}
	}