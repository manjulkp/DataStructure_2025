package search;

public class binary_search {

    public static int binary_search_iterative(int arr[], int start, int end, int x) {
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (x == arr[mid]) {
                return mid;
            } else if (x < arr[mid]) {

                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static int binarySearch(int arr[], int low, int high, int x)
    {
        if (low <= high) {
            int mid = low + (high - low) / 2;
    
            // If the element is present at the middle
            // itself
            if (arr[mid] == x)
                return mid;
    
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);
    
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, high, x);
        }
      return -1;
    }

}
