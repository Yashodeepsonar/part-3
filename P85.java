import java.util.Scanner;
 class Bad{
 	int i,n, bad;
 	
 	public static void main(String[] args) 
 	{
 		Scanner sc =new Scanner(System.in);	
 		System.out.println("no.of version");
 		int n=sc.nextInt();
 		System.out.println("bad");
 		int bad=sc.nextInt();
 		for(int i=1;i<=n;i++)
 		{

 			if (i==bad)
 			{
 				bad++;
 				System.out.println("true");
			}
 			else
 			{
 				System.out.println("false");
 			}
 		}

	}
 
 
}