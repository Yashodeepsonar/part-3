import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		int i,no, sum=1, n,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		no=sc.nextInt();
		int nsave=no;
		for (i=1;i<=no ;++i )
		{
			rem=no%10;
			sum+=(rem*rem*rem);
			no=no/10;
			System.out.println("number is amstrong "+sum);
		}
	}
	    
	}