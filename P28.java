import java.util.Scanner;
class Loop{
	public static void main(String[] args) {
		int no, sum=0, rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		no=sc.nextInt();
		int nsave=no;
		while(no>0)
		{
			rem=no%10;
			sum+=(rem*rem*rem);
			no=no/10;
		}
		if(sum==nsave){
		System.out.println("number is amstrong "+nsave);
	}
	    else{
	    	System.out.println("number is not amstrong "+nsave);

	    }
	}
}