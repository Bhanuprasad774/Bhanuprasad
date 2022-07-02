package sortingSearching;
import java.util.Arrays;

 class QuickSortMain {
	
	static int partition(int array[]; int low,int high) {
		int pivot = array[high];
		int i =(low - 1);
		for (int j = low; j < high;j++) {
			if (array[j]<=pivot) {
				i++;
			}
		}
		
	}

}
