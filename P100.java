class ChildThread extends Thread{
	public void run(){
		try{
		for (int i=1;i<10 ;++i ) {
			System.out.println("chaild thread");
				Thread.sleep(10);
			}
		}
			catch(InterruptedException ie){
				System.out.println("InterruptedException is occur");
			}
			
		}
	}

class ThreadDemo{
	public static void main(String[] args) throws InterruptedException{
		ChildThread c=new ChildThread();
 		c.start();
 		c.interrupt();
 		for (int i=1;i<10 ;++i ) {
			System.out.println("Main thread");
			Thread.sleep(100);
			

			}
}
}