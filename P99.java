class ChildThread extends Thread{
	public void run(){
		for (int i=1;i<10 ;++i ) {
			System.out.println("chaild thread");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
			
		}
	}
}
class ThreadDemo{
	public static void main(String[] args) throws InterruptedException{
		ChildThread c=new ChildThread();
 		c.start();
 		c.join();
 		for (int i=1;i<10 ;++i ) {
			System.out.println("Main thread");
			

			}
}
}