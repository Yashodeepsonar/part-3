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
class C extends B{
	 public void showC(){
	 	System.out.println("I am In Class C");
	 }
	}
class MyJava{
	public static void main(String[] args) {
		C obj=new C();
		obj.showA();
		obj.showB();
		obj.showC();

	}
}