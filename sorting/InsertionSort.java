package SortingAlgorithm;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35 , -15 , 7 ,55,1,-22};
		
		int n = intArray.length;
		
		for(int i = 1 ; i< n ; i++) {
			
			int firstElementValue = intArray[i];
			
			int j = i -1 ;
			
			while(j >= 0 && intArray[j]> firstElementValue) {
				intArray[j+1] = intArray[j];
				j = j-1;
			}
			intArray[j +1 ] = firstElementValue;
		}
		for (int i : intArray) {
			System.out.println(i);
		}
	}

}
