package ArrayPrograms;

public class FindnthLargestNumber {

	public static void main(String[] args) {
		
		//Sort the array
		int temp;
		int input[] = new int[] 
		{-101,101,84,83,1,1,0,2,3,4,3,5,6,7,8,8,9,1,2,4,3,4,-51,5,0,6,5,7,8,7,9,6,3,9,2,84,4,5,3,1,8,23,-101,-101};
		//{-1, -1, 2, 8, 3, 2, 2, 2, 5, 1, 1};
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length-1; j++) {
				if (input[j] > input[j+1]) {
					temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		
		//Print sorted array
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		
		//Find the nth largest element
		int n = 10, nLargest = 1;
		int nmax = input[input.length-1];
		
		//Take elements one by one
		for (int i = input.length-2; i >= 0; i--) {
			if(nLargest == n) break;
			//Compare two elements
			if(nmax > input[i]) {
				nmax = input[i];
				nLargest++;
			}
			
		}
		
		System.out.println("\nThe " + n + " largest number in the array is: " + nmax);
		
	}
	
}
