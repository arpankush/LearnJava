package ArrayPrograms;

public class LeftRotate {

	public static void main(String[] args) {
		int n = 3, i,j;
		int nArr[] = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		int oArr[] = new int[nArr.length];
//		System.out.println(nArr.length + " " + oArr.length);
		
		for(i = (nArr.length-1); i>=0 ;i--) {
			if((i-n)>=0) {
				oArr[i-n] = nArr[i];
				System.out.println(i-n + " - " + nArr[i]);
			}
			else {
				oArr[nArr.length+i-n] = nArr[i];
				System.out.println(nArr.length+i-n + " - " + nArr[i]);
			}

		}
		
		for(j = 0; j < oArr.length; j++)
		System.out.print(oArr[j] + " , ");
		
	}

}
