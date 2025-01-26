package search;

public class search_infinite_sequence {

    // 1,10,15,20,40,60,80,100 ,120 x =100
    public static int infinite_serach(int arr[] , int x){
        if (arr[0] == x){
            return 0;
        }
        
        int start =1;
        while(arr[start]<x){
            start = start*2;
        }

        if (arr[start] == x){
            return start;
        }

        int high = start-1;
        int low = start/2+1;

        // we could do a binary search from 1 to start-1 , but be can further eliminate first half so the low = start/2+1

        return binary_search.binary_search_iterative(arr, low, high, x);
    }
    
}
