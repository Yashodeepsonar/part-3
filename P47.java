import java.util.Scanner;
class Aarry{
	public static void main(String[] args) {
		double sum;
		int arr[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array element : ");
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++){

	    arr[i][j]=sc.nextInt();
		}
		}
		System.out.println("array value are:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++){
			sum=+arr[i][j];
		}
	}
    }
}
