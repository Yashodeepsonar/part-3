class SetName extends Thread{
	public void run(){
		System.out.println("1 method");
	}
	public static void main(String[] args) {
		SetName t1= new SetName();
		SetName t2= new SetName();
		System.out.println("name Thread t1:"+t1.getName());
		System.out.println("name Thread t2:"+t2.getName());
		t1.start();
		t2.start();
		t1.setName("yash");
		System.out.println("after changing name t1: "+t1.getName());
		System.out.println("after changing name t2: "+t2.getName());
	}
}