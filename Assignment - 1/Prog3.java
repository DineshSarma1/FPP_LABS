package firstclass.hw;

import java.util.Arrays;

public class Prog3 {

	public static void main(String[] args) {
		String[] animals = {"horse","dog","cat","horse","dog"};
		
		//String[] newAnimals = Arrays.stream(animals).distinct().toArray(String[]::new);
		
		
		String[] newAnimals = new String[animals.length];
		
		int index = 0;
		for(int i = 0; i< animals.length; i++) {
			int j;
			for(j = 0; j<i; j++) {
				if(animals[i] == animals[j]) {
					break;
				}
			}
			
			if(i == j) {
				newAnimals[index++] = animals[i];
			}
		}
		
		int noOfItem = 0;
		int newIndex = 0;
		
		do {
			
			if(newAnimals[newIndex] != null) {
				noOfItem++;
			}
			newIndex++;
		}while(newIndex < newAnimals.length);
		
		String[] finalAnimals = new String[noOfItem];
		for(int i = 0 ; i < noOfItem ; i++) {
			finalAnimals[i] = newAnimals[i];
		}
		
		System.out.println(Arrays.toString(finalAnimals));

	}

}
