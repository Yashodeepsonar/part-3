import java.util.*;
class rem{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String n=sc.next();
		System.out.println("enter Character to remove from string ");
		String m=sc.next();
		int len=n.length();
		char ch[]=n.toCharArray();
		char c;
		c=sc.next().charAt(0);
		for (int i=0;i<len ;i++ ) {
			if(ch[i]==c){
			continue;
			}
			else{
				m=m+ch[i];
			}


	}
	System.out.println("reversed string "+m);
}
}