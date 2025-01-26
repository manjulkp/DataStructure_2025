package search;

public class Find1RepeatingNumber {

    /*
     * size >= 2
     * only 1 number is repeated 
     * all numbers from 0 to max are present 
     * therefore  0<max(arr)<=(n-2)
     * 
     * max(arr) >= 0
     * max(arr) <= (n-2)
     * 
     */

     public static int findRepeatedNumber(int arr[] , int n){
        boolean visited[] = new boolean[n];

        for(int i=0;i<n;i++){
            if(visited[arr[i]] == true)
                return arr[i];
            visited[arr[i]] = true;
            
        }
        return -1;

     }

     // better soln - [1,3,2,4,3,3] where there is no 0
    /*
     * size >= 2
     * only 1 number is repeated 
     * all numbers from 0 to max are present 
     * therefore  1<max(arr)<=(n-2)
     * 
     * max(arr) >= 1
     * max(arr) <= (n-2)
     * 
     * use each number as index and form chains 
     * 
     */

     public static int slowFastMethod(int arr[] , int n){
        /*
         * [1,3,2,4,6,5,7,3]
         * [0,1,2,3,4,5,6,7]
         * 
         *                      ------------------
         *                      |                |-----> loop is formed                     
         * a[0] ---> a[1]---> a[3]---> a[6]---> a[7]
         *  1 ------> 3------> 4------> 7------> 3
         */

         int slow = arr[0];
         int fast = arr[0];
         do { 
            slow = arr[slow];        //by 1 steps
            fast = arr[arr[fast]];   //by 2 steps 
         } while (slow != fast);

/*
 * slow = 1  fast = 1
 * slow = 3  fast = 4
 * slow = 4  fast = 7
 * slow = 6  fast = 4 
 * slow = 7  fast = 7 where fast == slow 
 * 
 *  we have loop formed with fast == slow 
 *  now start slow = a[0] , move to beginning of loop 
 *  when slow meets fast , we can find the repeated number by slow 
 * 
 */

    slow = arr[0];
    while(slow !=fast){
        slow = arr[slow];
        fast = arr[fast];
    }
    return slow ; // or return fast;
    /*
     * slow = 1  fast = 7
     * slow = 3  fast = 3
     * 
     * 
     */

       

     }

     // slow - fast technique if there is 0 in the array 

     public static int slowFastMethod_WithZero(int arr[] , int n){
        // +1 is down to avoid self loop becos arr[0] == 0 then it form self loop , to avoid this we are doing + 1
        int slow = arr[0] +1;
         int fast = arr[0] +1;
         do { 
            slow = arr[slow]+1;        //by 1 steps
            fast = arr[arr[fast]+1]+1;   //by 2 steps 
         } while (slow != fast);

         slow = arr[0]+1;
         while(slow !=fast){
             slow = arr[slow]+1;
             fast = arr[fast]+1;
         }
         return slow ; // or return fast;
     }

    
}
