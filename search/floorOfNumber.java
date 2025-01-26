package search;

public class floorOfNumber {
    // 35. search insert position 


    public static int floorOfNumberIterative(int arr[], int start, int end, int x) {
        int n = arr.length;

        if(x<arr[0])
           return -1;

        if(arr[n-1] <= x){
            return arr[n-1];
        }

        int mid = start + (end - start) / 2;

        while (start <= end) {

            if (x == arr[mid]) {
                return mid;
            } else if ( mid >0 && arr[mid-1] < x && x<arr[mid]) {
                return mid-1;
            }else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    
}
