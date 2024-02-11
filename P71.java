class Test{
	int a;
	int b;
	Test(int a,int b){
		this.a=a;
		this.b=b;
	}
	void Display(){
		System.out.println("a= "+a+"b= "+b);
	}
	public static void main(String[] args) {
		Test obj=new Test(40,80);
		obj.Display();
	}
}