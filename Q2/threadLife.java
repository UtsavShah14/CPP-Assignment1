//Program to check if the thread is alive. Print when it is alive and create a control to terminate the program
import java.util.Scanner;
public class threadLife {

	public static void main(String[] args) {

		threadAlive instance1 = new threadAlive(); //Creates an instance of thread.
													 
		instance1.start();  //Call the thread's run method
	
		Scanner input = new Scanner(System.in);
		input.nextLine();  //Scans new line to terminate the code
		instance1.stopRunning();  //Calls the Stop method
	}
}