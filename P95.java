class ChildThread implements Runnable{
	public void run(){
		for (int i=1;i<10 ;++i ) {
			System.out.println("chaild thread");
			
		}
	}
}
class ThreadDemo{
	public static void main(String[] args) {
		Thread t=new Thread(new ChildThread() );
		t.start();
 		for (int i=1;i<10 ;++i ) {
			System.out.println("Main thread");
			

			}
}
}