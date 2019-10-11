public class threadAlive extends Thread{
	
	private volatile boolean e=true;
	
	public void stopRunning() { //To stop the Thread
		e=false;
		System.out.print("Terminated");
	}
	
	@Override
	public void run() {  //To run the thread, and control the sleep time.
		while(e) {
			System.out.println("In thread and Alive. Press ENTER to exit");
			try {
				sleep(100);
			} catch (Exception e) {
			}
		}
	}
}