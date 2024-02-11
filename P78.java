
class A{
	public A(){
		System.out.println("class A constructor");
	}
	 public void showA(){
	 	System.out.println("I am In Class A");
	 }

};
class B extends A{
	public B(){
		System.out.println("class B constructor");
	}
	 public void showB(){
	 	System.out.println("I am In Class B");
	 }

	 
};
class MyJava{
	public static void main(String[] args) {
		B obj=new B();
		obj.showB();
		
	}
} 