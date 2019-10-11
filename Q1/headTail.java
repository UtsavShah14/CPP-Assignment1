//Program to compute frequency of head-tail

public class headTail {

	public static void main(String[] args) {
		
		int n = 1000;
		int array[] = new int[n];
		
		for(int i = 0;i<array.length;i++)
				{
					array[i] = (int)(Math.random()*10);
				}
		
		/*
		 * for (int i = 0; i < array.length; i++) { System.out.println(array[i]); }
		 */
		
		HeadTailFlips instance1=new HeadTailFlips(array);
		
		instance1.start();
		
		try{
			instance1.join();
		}
		catch(InterruptedException e) {
		}
		
		System.out.println("The number of heads are: "+ ((int)instance1.getResult()));
		System.out.println("The number of tails are: "+ (n-(int)instance1.getResult()));
		
	}
}
