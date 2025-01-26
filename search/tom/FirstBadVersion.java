package search.tom;

public class FirstBadVersion {

    // https://leetcode.com/problems/first-bad-version/description/?envType=problem-list-v2&envId=binary-search/*
 /*
  * Input: n = 5, bad = 4
    Output: 4
    Explanation:
    call isBadVersion(3) -> false
    call isBadVersion(5) -> true
    call isBadVersion(4) -> true
    Then 4 is the first bad version.
  *
  * [false,false ,false ,true,true]
  * 
  */

    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false) 
                 return mid;
            else if(isBadVersion(mid)==false ) {
                 // move the low pointer
                 low = mid+1;
            }
            else {
            high= mid;
            }
        }     
                    return -1;
    }


            
                private boolean isBadVersion(int mid) {
                    return false;
                }
    
}
