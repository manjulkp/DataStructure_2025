package search;

public class medianInTwoSortedArray {


    public static double median(int a[] , int b[] , int m , int n){
        if(m>n)
          median(b , a , n , m);

        /*
         * divide the 2 array into 2 half , incase of odd , then left array will have more 
         * group 1 -> 0 to i1-1 
         * group 2 -> i1 to m
         * 
         * 
         * left has all nums less than right side 
         * then take max num from left
         * min from right - to get (max + min /2 )
         * 
         * 
         */
        
         



         int start = 0;
         int end = m;

         while(start<=end){
            int i1 = start+end /2;
            int i2 = (m+n+1)/2-i1;

            int max1  = (i1==0) ? Integer.MIN_VALUE :a[i1-1]; // max1 on left side 
            int min1  = (i1==m) ? Integer.MAX_VALUE :a[i1];  // min1 on right side

            int max2  = (i2==0) ? Integer.MIN_VALUE :b[i2-1]; // max2 on left side 
            int min2  = (i2==n) ? Integer.MAX_VALUE :b[i2];  // min2 on right side

            if(max1<=min2 && max2<=min1){

                if( (m+n) % 2 ==0 ){
                int max_value = Math.max(max1, max2);
                int min_value = Math.min(min1, min2);
                     return (double)(max_value + min_value)/2.0;  // even numbers 

                }else{
                    return Math.max(max1, max2); // odd numbers
                }

            }else if (max1 > min2){
                end = i1-1 ;  // left side has num which is greater so move the end point 
            }else{
                start = i1+1;
            }




         }
        return -1;
    }
    
}
