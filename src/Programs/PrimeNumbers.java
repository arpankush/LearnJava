package Programs;

public class PrimeNumbers {

	public static void main(String... args) {	
		int i,n = 127;
		String output = "Prime";
		for(i = 2; i <= n/2; i++) {
			if(n%i==0) {
				output = "Not Prime";
				break;
			}
		}
		System.out.println(output);
	}
}
