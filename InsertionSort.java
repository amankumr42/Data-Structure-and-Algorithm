package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { -8, -10, 0, 1, -50, -1, -23 };
		int tempValue = 0;
		int sortedIndex = 0;
		for (int i = 1; i < array.length - 1; i++) {
			tempValue = array[i];
			sortedIndex = i;
			while (sortedIndex > 0 && array[sortedIndex - 1] > tempValue) {
				array[sortedIndex] = array[sortedIndex - 1];
				sortedIndex = sortedIndex - 1;
			}
			array[sortedIndex] = tempValue;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
