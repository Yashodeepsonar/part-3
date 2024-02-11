import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		int i,no, n1,n2,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		no=sc.nextInt();
		for (i=1;i<=no ;++i) {
			n1=no%10;
			sum=sum+n1;	
			n2=n1;	
		}
		System.out.println("factorial of number is :"+sum);

			
	}
}