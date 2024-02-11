class A{
	 public void showA(){
	 	System.out.println("I am In Class A");
	 }

}
class B{
	 public void showB(){
	 	System.out.println("I am In Class B");
	 }

	 
}
class C {
	 public void showC(){
	 	System.out.println("I am In Class C");
	 }
	}
class D extends A,B,C{
	public void showD(){
		System.out.println("I am In Class D");
	 }
	}
class MyJava{
	public static void main(String[] args) {
		D obj=new D();
		obj.showA();
		obj.showB();
		obj.showC();
		obj.showD();

	}
}