/*Program to toss 2 die with 2 different threads, n number of times. Result should be in a shared array and main
program computes the frequency of the numbers tossed*/

public class DieToss {
	public static void main(String[] args) {
		int count[] = new int[6];  //Array to count the frequency
		int n=250;  //Variable to take user input
		int toss[] = new int[2*n];  //Shared array
		DieTossThread instance = new DieTossThread(toss,n);
		DieTossThread1 instance1 = new DieTossThread1(toss,n);
		instance.start();
		instance1.start();
		try {
			instance.join();
			instance1.join();
		} catch (Exception e) {
		}
		
		 /* for (int i = 0; i < 2*n; i++) { //Loop to check array
		 * System.out.println("Array <---> position " +i+ " --- " +toss[i]); }
		 */
		
		for(int i = 0; i < 2*n; i++)  //Loop to traverse the shared array
			for (int j = 0; j < 6; j++) {  //Loop to traverse count array
				if(toss[i]==(j+1))  //Check the condition to increment frequency
					count[j]++;  //Increment count. (index position + 1) corresponds to number 
			}
		for(int i=0; i<6;i++) 
			System.out.println("The frequency of " +(i+1)+ " is: " + count[i]);
	}
}