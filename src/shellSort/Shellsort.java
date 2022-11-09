package shellSort;

public class Shellsort {
	public static void main(String[] args) {
		int[] array = {2, 3, 1, 10, 11};
		sort(array);
		printArray(array);
	}
	
	public static void sort(int[] array) {
		int length = array.length;
		
		for(int gap = length/2; gap > 0; gap/=2) {
			for(int i = gap; i<array.length; i++) {
				int tmp = array[i];
				for(int j = i; j>= gap && array[j - gap] > tmp; j -= gap) {
					swap(array, i, j);
				}
			}
		}
	}
	
	
	public static void printArray(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.println(i + ") " + array[i]);
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = array[i];
	}
}
