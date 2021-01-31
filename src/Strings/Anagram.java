package Strings;

public class Anagram {

	public static void main(String[] args) {
		
		String in1 = "There are some characters in this string";
		String in2 = "There are some characters in this string";
		
		System.out.println(isAnagram(in1, in2)?"Anagram":"Not Anagram");
		
	}
	
	public static boolean isAnagram(String i1, String i2) {
		
		if(i1.length() != i2.length())	return false;
		else {
			
			char ch1[] = sortString(i1.toLowerCase());
			char ch2[] = sortString(i2.toLowerCase());
			
			for (int i = 0; i < ch1.length; i++) {
				if(ch1[i] != ch2[i]) 
					return false;
			}

		}
		
		return true;
	}
	
	public static char[] sortString(String i1) {
		
		char ch[] = i1.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 1; j < ch.length; j++) {
				if (ch[j-1] > ch[j]) {
					temp = ch[j-1];
					ch[j-1] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
		
	}

}