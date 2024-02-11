import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		int no, rev=0, rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		no=sc.nextInt();
		int nsave=no;
		while(no>0)
		{
			rem=no%10;
			rev=(rev*10+rem);
			no=no/10;
		}
		if(nsave==rev){
		System.out.println("number is pailndrome "+nsave);
	}
	    else{
	    	System.out.println("number is not pailndrome "+nsave);

	    }
	}
}