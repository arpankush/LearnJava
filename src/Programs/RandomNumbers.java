package Programs;

public class RandomNumbers {

	public static void main(String[] args) {
		
		/*
		 * for(int i = 0; i<10; i++) {
		 * System.out.println("Random number between 0 & 1");
		 * System.out.println(Math.random()); }
		 */
		
		for(int i = 0; i<10; i++) {
			System.out.println("Random number between 1 & 10");
			int min = 1,max = 10;
			System.out.println(Math.random()*(max-min+1)-min);
		}
	}

}
