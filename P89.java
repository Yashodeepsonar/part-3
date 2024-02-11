import java.util.*;
class Binary{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter binary code");
	 String Str =sc.next();
	 int count=0;
		int len=Str.length();
	char ch[]=Str.toCharArray();
		if (len<=32){
		for(int i=0;i<len;i++){
			if(ch[i]=='1')
			{
				count++;
			}
		}
	}
		else{
				System.out.println("Binary code is not 32 bit");

			}
		System.out.println("no of 1's in binary code is "+count);
	}
	}

