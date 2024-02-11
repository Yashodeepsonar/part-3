class New{
	{
		System.out.println("i am in non static block");
	}
	static{
		System.out.println("i am in static block");

	}
	public static void main(String[] args) {
		New s=new New();
		System.out.println("i am in main");
	}
}