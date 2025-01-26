package search;

public class allocateMinPagesToStudentToRead {
    
  /*
   * books_pages = [10,20,30,40]
   * students = 2
   * output is 60
   * 
   * Input: arr[] = [12, 34, 67, 90], k = 2
    Output: 113
    Explanation: Books can be distributed in following ways:

    [12] and [34, 67, 90] – The maximum pages assigned to a student is  34 + 67 + 90 = 191.
    [12, 34] and [67, 90] – The maximum pages assigned to a student is 67 + 90 = 157.
    [12, 34, 67] and [90] – The maximum pages assigned to a student is 12 + 34 + 67 = 113.

    The third combination has the minimum pages assigned to a student which is 113.
   * 
   * 
   */

   public static int sumOfPages(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    return sum;
  }

public static int findPages(int[]A,int n,int numberOfStudent)
{
    
    if(numberOfStudent>n){
        return -1;
    }
    int start=A[n-1]; // max number will be the start value 
    int end=sumOfPages(A); // total number of pages 
    int candidate=Integer.MAX_VALUE;
    
    while(start<=end){
        int mid=start+(end-start)/2;
        //expected student for given mid value
        int expectedStudent=expectedStudent(A,mid);
                if(expectedStudent<=numberOfStudent){
                    candidate=mid;
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return candidate;
        }
        
        public static int expectedStudent(int[] arr,int mid){
            int count=0;
            int currSum=0;
            for(int i=0;i<arr.length;i++){
                currSum = currSum+arr[i];
                if(currSum>mid){
                    currSum=arr[i];
                    count++;
                }
            }
            count++;
            return count;
            
        }
    
}
