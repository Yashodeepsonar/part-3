import java.util.Scanner;
class Power{
	public static void main(String[] args) {
		double x,n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		x=sc.nextInt();
		if(x>=0) {
		n=x*4;
		m=Math.pow(4,x);
			if(m!=n)
			{
			
			System.out.println("true");

			}
			else{
			System.out.println("false");
		}
	   }
	}
}