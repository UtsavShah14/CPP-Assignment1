
public class DieTossThread1 extends Thread{
	
	int die[];
	int n;
	public DieTossThread1(int toss[], int x) {
		die=toss;
		n=x;
	}
	@Override
	public void run() {
		for (int i = n; i < 2*n; i++) {  //Loop to generate random numbers.
			die[i]=(int)(Math.random()*((6-1)+1)+1);
		}
//		for (int i = n; i < 2*n; i++) {
//			System.out.println("Array2 <---> position - " +i+ " --- " +die[i]);
//		}
	}
}
