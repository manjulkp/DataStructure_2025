package sorting;

public class InsertionSorting {

    /*
     * 
     * we have 2 part of the array 
     * sorted part | unsorted part 
     * sorted part start at 0 | unsorted part  start from (1- n)
     * 
     * every element in unsorted part is stored in key and 
     * compared with every element of sorted part and identify the place it needs to be inserted
     * the while loop terminate at j position 
     * and (j+1) is where we neeed to insert the key element
     */
    /*
     *  1,4,3,2
     * 
     * 
     */

     public static void insertPosition(int arr[] , int n){
        for(int i=1;i<n;i++){

            int key = arr[i]; // element in unsorted part that needs right position in sorted part
            // key = 3
            int j = i-1;

            // arr[j] , is the sorted part
            while(j>=0 && arr[j] > key){ 
                arr[j+1] = arr[j]; // move j element to j+1
                j--;

            }

            arr[j-1] = key ;
            /*
             * 4>3 so we shift 
             * 1,4,4,2 key =3
             * 1>3 is false and j= 0
             * so the while loop breaks 
             * j+1 is where i need to insert key  -> arr[j-1] = key ;
             */


        }
     }

}