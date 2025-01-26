package search;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {

    public static int noOfBuilding(int arr[] , int ladder , int bricks ){
        // use ladder for largest height  so ladder is used for "k" largest number
        // use bricks for smallest heights 
        // https://www.youtube.com/watch?v=wAxhnUhXvHE&t=192s

        // store a min heap priority queue , to pop the min number 

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = arr.length;

        for(int i=1;i<n;i++){
            int diff = arr[i] - arr[i-1];

            if(diff > 0){
                // check whether to use ladder or brick

                if(minHeap.size() < ladder ){
                    // add the different between 2 building to minHeap
                    minHeap.add(diff);
                }else{
                    // optimise the previous ladder 
                    /*
                     * 1. we have used all the ladder , so check if the diff is greater than an ladder ,
                     * 2. swap the ladder with bricks 
                     * 
                     * 
                     * 
                     */
                    int brickNeed = diff;

                    if(!minHeap.isEmpty() && diff > minHeap.peek()){
                        // swap the ladder with bricks 
                        brickNeed = minHeap.remove();
                        minHeap.add(diff);

                    }

                    if(bricks - brickNeed >= 0){ // means we can climb the building
                                 bricks =  bricks-brickNeed;
                    }else{
                        // there are no bricks , so i could only reach till the previous building 
                        return i-1;
                    }
                }
            }

        }

        return n-1;

    }
    
}
