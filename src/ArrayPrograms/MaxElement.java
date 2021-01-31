package ArrayPrograms;

public class MaxElement {

	public static void main(String[] args) {
		
		int input[] = new int[] {-101,101,84,83,1,1,0,1,1,2,3,4,3,5,6,7,8,8,9,1,1,2,4,3,4,-51,5,0,6,5,7,8,7,9,6,3,9,2,84,4,5,3,1,8,23,-101,-101};
				//{-1, -1, 2, 8, 3, 2, 2, 2, 5, 1, 1};
		int max = input[0];

		
		//Take elements one by one
		for (int i = 1; i < input.length; i++) {
			//Compare two elements
			if(max<input[i]) {
				max = input[i];
			}
			
		}
		
		System.out.println(max);
		
	}

}
