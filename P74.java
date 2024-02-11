class Test{
	public static void main(String[] args) {
		
	
	try{
		System.out.println("i am in try");

	}
	catch(ArithmeticException ae){
		System.out.println("i am in catch");
	}
	finally{
		System.out.println("i am in finally");
	}
	System.out.println("After try//catch//finally");
}
}