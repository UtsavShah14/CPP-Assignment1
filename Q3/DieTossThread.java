
public class DieTossThread extends Thread{

	int die[];
	int n;
	public DieTossThread(int toss[],int x) {
		die=toss;
		n=x;
	}
	@Override
	public void run() {  //Loop to generate random numbers.
		for (int i = 0; i < n; i++) {
			die[i]=(int)(Math.random()*((6-1)+1)+1);
		}
//		for (int i = 0; i < n; i++) {
//			System.out.println("Array1 <---> position - " +i+ " --- " +die[i]);
//		}
	}
}
