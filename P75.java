class A{
	 public void showA(){
	 	System.out.println("I am In Class A");
	 }

}
class B extends A{
	 public void showB(){
	 	System.out.println("I am In Class B");
	 }
	 
}
class MyJava{
	public static void main(String[] args) {
		B obj=new B();
		obj.showA();
		obj.showB();

	}
}