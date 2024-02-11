class ChildThread {
	public static synchronized void print(String name){
		for (int i=0;i<3;i++){System.out.println("Batting: "+name);
		try{
			
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
			
		}
	}
}


class ThreadDemo extends Thread{
	public void run(){
		ChildThread.print("sachin");
	}
}
class ThreadDemo1 extends Thread{
	public void run(){
		ChildThread.print("Dhoni");
	}
}
class ThreadDemo2 extends Thread{
	public void run(){
		ChildThread.print("Rohit");
	}
}
class Main{
	public static void main(String[] args) {
		new ThreadDemo().start();
		new ThreadDemo1().start();
		new ThreadDemo2().start();

	}
			}
