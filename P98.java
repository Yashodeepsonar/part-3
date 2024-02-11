class ChildThread extends Thread{
	public void run(){
		for (int i=1;i<10 ;++i ) {
			System.out.println("chaild thread");
			Thread.yield();
			
		}
	}
}
class ThreadDemo{
	public static void main(String[] args) {
		ChildThread c=new ChildThread();
 		c.start();
 		for (int i=1;i<10 ;++i ) {
			System.out.println("Main thread");
			

			}
}
}