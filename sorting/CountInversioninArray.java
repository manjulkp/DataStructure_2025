package sorting;

public class CountInversioninArray {
    /*
     * inversion means - i<j and arr[i] > arr[j]
     * [2,4,1,3,5]   [4,1]  [4,3] 
     */

     public static int naiveSoln(int arr[] , int n){
        int res=0;
        for(int i=0;i<n-1;i++){

            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    res++;
                }
            }
        }
        return res;
     }


     public static int merge(int arr[] , int low , int high , int mid){
        int n1 = mid -low +1;
        int n2 = high - mid;
        int res =0;

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
            }else {  // when left[i] > right[j]
                arr[k] = right[j];
                j++;
                k++;
                res = res + (n1-i) ; // if left[i] > right[j] , then remaining ele in left will be greater for this right[j] element
                // so res = res + (n1-i)
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
         return res;

     }

     public static int mergeSort(int arr[] , int low , int high){
        int res = 0;
        if(low<high){
             int mid = (low+high)/2;
            res = res + mergeSort(arr, low , mid);
            res = res +  mergeSort(arr, mid+1, high);
            res = res +  merge(arr, low, mid, high);
        }
        return res;
     }
    
}

    

