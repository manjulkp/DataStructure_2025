package search;

public class square_root {

    public static int square_root_iterative(int arr[],  int x) {

        int n = arr.length;
        int start = 1;
        int end = x;
        int mid = start + (end - start) / 2;
        int ans = -1;

        while (start <= end) {
            int square = arr[mid] * arr[mid];

            if (x == square) {
                return mid;
            } else if (square > x) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
    
}
