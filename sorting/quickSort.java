package sorting;

public class quickSort {

    public static void sort(int arr[] , int start , int end){
        if(start<end){
            int pivot = findPivot(arr, start , end);
            sort(arr, start , pivot);
            sort(arr, pivot+1, end);
        }
    }

    private static int findPivot(int[] arr, int start, int end) {

		//start i from before 0 ,point before the array begins -1; 
		int i = start - 1;
        // pivotal is always first element
		int pivotal = arr[start];
		//end to end+1 ,point after the array end 
		int j = end + 1;

		// compare the parition with pivotal element

		while (true) {

			do {
				i++;
			} while (arr[i] < pivotal);

			do {
				j--;

			} while (arr[j] > pivotal);

			// i and j are crossed each other ,then return j
			if (i >= j)
				return j;
			// if not swap arr[i] and arr[j]
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			

		}

	}
    
}
