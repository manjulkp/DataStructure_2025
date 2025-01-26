package search;

public class SumInSortedArray {

    public static int[] findSumInSorted(int arr[] , int n, int sum ){
        int start = 0 ;
        int end = n-1;

        while(start <=end){
            if (arr[ start] + arr[end] == sum){
                return new int[] { start, end }; // found the pair
            }else if(arr[ start] + arr[end] < sum){
                start++;
            }else{
                end--;
            }
        }
        return new int[] { -1, -1 };
    }
    
}
