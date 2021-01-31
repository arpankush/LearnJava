package Programs;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		int n = 371,op = 0,i = n,rem;
		while(i>0) {
			rem = (i%10);
			op = op + (rem * rem * rem);
			i /= 10;
		}
		System.out.println(op==n? "Armstrong":"Not Armstrong");

	}

}