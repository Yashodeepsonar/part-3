class Str{
	public static void main(String[] args) {
		String s="eooosa";
		System.out.println(s);
		String s1=new String("eooosa");
		System.out.println(s);
		char[] ch={'e','o','s','a'};
		String s2=new String(ch);
		System.out.println(s2);
		char[] ch1={'e','o','s','a','e','o','s','a','e','o','s','a'};
		String s3=new String(ch1,2,8);
		System.out.println(s3);
		byte[] b={65,67,68,69,79};
		String s4=new String(b);
		System.out.println(s4);



	}
}