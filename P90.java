import java.util.*;
class Pan{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		String rev="";
		int len=str.length();
		for (int i=0;i<len ;i++ ) {
			rev=str.charAt(i)+rev;

		}
		System.out.println("reversed string "+rev);
		if(rev.equals(str)){
			System.out.println("palindrom");
		}
		else{
			System.out.println("not a palindrom");
		}

		
	}
}