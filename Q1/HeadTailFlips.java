
public class HeadTailFlips extends Thread {

	int h = 0;
	int f[];
	
	HeadTailFlips(int f1[]) {
		f=f1;
	}
	
	public void run() {
		for(int i = 0;i<f.length;i++){
//			System.out.println(i+"----"+Math.round(f[i]));
			if (f[i] > 4) {
				h++;
			}
		}
//		for (int j = 0; j < f.length; j++) { //For initial loop check
//		System.out.println(f[j]);
//		}
	}
	
	double getResult() {
		return h;
	}

}