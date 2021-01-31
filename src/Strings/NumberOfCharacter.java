package Strings;

public class NumberOfCharacter {

	public static int numberOfChar(String in) {
		int ch = 0;
		for (int i = 0; i < in.length(); i++) {
			if(in.charAt(i) != ' ')
				ch++;
		}
		return ch;
		
	}
	
	public static void main(String[] args) {
		
		String in = "The world is a very beautiful mess.";
		System.out.println(numberOfChar(in));
	}

}
