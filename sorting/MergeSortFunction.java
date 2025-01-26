package sorting;
public class MergeSortFunction {

    /*
     * low to mid is sorted
     * mid+1 to high is sorted
     * 
     * low need not be 0 
     * high need not be n-1
     * 
     * 
     * low<=mid<high
     * 
     * 
     */

     public static void merge(int arr[] , int low , int high , int mid){
        int n1 = mid -low +1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        /*
         * create left and right array (auxillary array)
         */

         for(int i=0;i<n1;i++){
            left[i] = arr[low+i]; // this is important low is not always 0 , it can be anywhere intermediate
         }

         for(int i=0;i<n2;i++){
            right[i] = arr[mid+1+i];
         }

         int i=0;
         int j=0;
         int k=low; // assign k to low as it is result that stores the sorted ordered element
         // starting from low index 

         while(i<n1 && j<n2){
// use this rule -      * low<=mid<high
            if(left[i]<=right[j]){ // important step
                arr[k] = left[i];
                i++;
                k++;
            }else {
                arr[k] = right[j];
                j++;
                k++;
            }
         }

         while(i<n1){
            arr[k] = left[i];
                i++;
                k++;
         }

         while(j<n2){
            arr[k] = right[j];
                j++;
                k++;
         }




     }

     public static void mergeSort(int arr[] , int low , int high){
        if(low<high){
             int mid = (low+high)/2;
             mergeSort(arr, low , mid);
             mergeSort(arr, mid+1, high);
             merge(arr, low, mid, high);
        }
     }
    
}
