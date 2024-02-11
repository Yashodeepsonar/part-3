import java.util.Scanner;
class magic{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ASCII number :");
		for (int i=0;i<4 ;i++ ) {
			int ac=sc.nextInt();
			if(ac>=65 && ac<=90){
				char ch=(char)ac;
				System.out.println("ASCII:"+ac+"|Character : "+ch);

			}
			else{
				System.out.println("Invalid ASCII number"+ac);
			}
			
		}
	}
}