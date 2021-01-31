package ArrayPrograms;

public class Sort {

	public static void main(String[] args) {
		
		int temp;
		int input[] = new int[] 
		{-101,101,84,83,1,1,0,1,1,2,3,4,3,5,6,7,8,8,9,1,1,2,4,3,4,-51,5,0,6,5,7,8,7,9,6,3,9,2,84,4,5,3,1,8,23,-101,-101};
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
		
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		
	}

}
