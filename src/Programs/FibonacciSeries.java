package Programs;

import java.io.IOException;

public class FibonacciSeries {

	public static void main(String... args) throws IOException {
		System.gc();//garbage collector
		int n = 10;//System.in.read();//Enter number of fibonacci series numbers
		int num1 = 0, num2 = 1, next = 0;
		System.out.print("Fibinacci Series: " + num1 + " " + num2 + " ");
		for(int i=3 ; i<n ; i++) {
			next = num2 + num1;
			System.out.print(next + " ");
			num1 = num2;
			num2 = next;
		}

	}

}
