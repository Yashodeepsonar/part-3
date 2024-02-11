class Str{
	public static void main(String[] args) {
		Str s1=new Str();
		Str s2=new Str();
		System.out.println(s1==s2);
		String s3="Yash";
		String s4="Yash";
		System.out.println(s3==s4);
		String s5= new String("Error");
		String s6= new String("error");
		System.out.println(s5==s6);
	}
}