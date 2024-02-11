class Static{
	public void show(){
		System.out.println("Non static show0");

		
	}
	public void show1(){
		System.out.println("static show");

}
public static void main(String[] args) {
	Static s=new Static();
	System.out.println("i am in main");
}
}