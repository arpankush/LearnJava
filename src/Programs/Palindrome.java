package Programs;

public class Palindrome {

	public static void main(String... args) {
		
		//String
		/*
		 * String input = "Meme",reverse = ""; String x = input.toLowerCase(); for(int
		 * i=x.length()-1;i>=0;i--) { reverse += x.charAt(i); } System.out.println(x +
		 * " vs " + reverse);
		 * System.out.println(x.equals(reverse)?"Palindrome":"Not a Palindrome");
		 */
		
		//Number
		int n = 1000011,m = 0, o = n;
		while(n>0) {
			m *= 10;
			m += n%10;
			n /= 10;
		}
		System.out.println(o + " vs " + m);
		System.out.println(o==m?"Palindrome":"Not Palindrome");
		
	}

}
