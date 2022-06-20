package assignmentfour;

import java.util.Arrays;

public class Prog3 {

	public static void main(String[] args) {

		//declaring and initializing integer array
		int[] inputData = {1,8,4,9,23,65,89,32,56,10};
		
		//sorting input array in ascending order
		Arrays.sort(inputData);
		
		System.out.println(Arrays.toString(inputData));
		
		System.out.println("Element found at index : "+performBinarySearch(inputData,
				0,
				inputData.length - 1,
				56));
		
	}
	
	public static int performBinarySearch(int[] input, int sIndex, int eIndex, int searchElement) {
		if(input != null || eIndex >= sIndex) {
			
			//finding middle index
			int mIndex = sIndex + (eIndex - sIndex) / 2;
			
			if(input[mIndex] == searchElement) {
				return mIndex;
			}else if (input[mIndex] > searchElement) {
				return performBinarySearch(input,sIndex,mIndex - 1,searchElement);
			}else {
				return performBinarySearch(input,mIndex + 1, eIndex, searchElement);
			}
		}
		
		return -1;
	}

}
