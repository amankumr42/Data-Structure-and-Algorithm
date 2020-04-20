package SortingAlgorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int[] int_array = {2,9,0,7,1,3,5};
		int n = int_array.length;
		int temp = 0 ;
		boolean is_sorted = true;
		for(int i = 0 ; i < n  ; i++) {
			
			for(int j = 1 ; j < (n - i) ; j++ ) {
				
				if(int_array[j-1] > int_array[j]) {
					
					temp = int_array[j-1];
					int_array[j-1] = int_array[j];
					int_array[j] = temp;
					is_sorted = false;
				}
			}
			
			if(is_sorted) break;
			System.out.println(int_array[i]);
		}	
	}
}
