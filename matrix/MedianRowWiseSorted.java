package matrix;

import java.util.PriorityQueue;

public class MedianRowWiseSorted {

    public static int  findMedian(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>( (a,b) -> a[0]-b[0] );
        // minheap of int array

        int res = -1;
        int mid = (r*c)/2;

        int count =0;

        // push all the first element of the row 
        for(int i=0;i<r;i++){
            minHeap.add(new int[] {arr[i][0] , i , 0}) ;  // push first element , row , col
        }

        // extract items from minheap
        while(count<=mid){
            int extracted_array[] = minHeap.poll();
            res = extracted_array[0];
            int row = extracted_array[1];
            int col = extracted_array[2];

            count++;

            // if there are more items in row 
            // push the next col in the row 
            // push the mat[row][col+1] in the queue, 
            if(col +1 < c){
                minHeap.add(new int[] {arr[row][col+1] , row , col}) ;
            }
        }

        return res;








    }
    
}
