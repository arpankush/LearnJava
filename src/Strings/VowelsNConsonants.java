package Strings;

public class VowelsNConsonants {

	public static int numberOfChar(String in) {
		int ch = 0;
		for (int i = 0; i < in.length(); i++) {
			if(in.charAt(i) != ' ')
				ch++;
		}
		return ch;
		
	}
	
	public static int countVowels(String in) {
		int v=0;
		for (int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				v++;
			}
		}
		return v;
		
	}
	
	public static void main(String[] args) {
		
		String in = "a e i o u b c d f";
				//"The world is a very beautiful mess.";
		System.out.println("Total number of characters: "+in.length());
		System.out.println("Total number of characters without spaces: "+numberOfChar(in));
		System.out.println("Total number of vowels: "+ countVowels(in));
		System.out.println("Total number of consonants: "+(numberOfChar(in)-countVowels(in)));
	}

}
