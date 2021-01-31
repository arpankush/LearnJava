package ArrayPrograms;

public class ElementFrequency {

	public static void main(String[] args) {
		
		int index = 0,temp,count;
		boolean newElement;
		int input[] = new int[] {-1, -1, 2, 8, 3, 2, 2, 2, 5, 1, 1};
				//{-101,-101,84,83,1,1,0,1,1,2,3,4,3,5,6,7,8,8,9,1,1,2,4,3,4,-51,5,0,6,5,7,8,7,9,6,3,9,2,84,4,5,3,1,8,23,-101,-101};
		int unique[] = new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
			//Take the element
			temp = input[i];
			
			//Check element in unique array
			newElement = true;
			for (int j = 0; j < unique.length; j++) {
				if(unique[j] == temp) {
					newElement = false;
					//System.out.print(newElement);
					break;
				}
			}//j++
			
			//If newElement is found store it in unique array
			if(newElement == true) {
				unique[index] = temp;
				System.out.print("Element: " + unique[index] + " Count: ");
				index++;
				count = 1;
				
				//Also count the occurrences
				for (int j = i+1; j < input.length; j++) {
					//Count
					if(input[j] == temp) {
						count++;
					}
					
				}
				//Print count after calculating
				System.out.print(count + "\n" );
			}
			
		}//i++
		
	}

}