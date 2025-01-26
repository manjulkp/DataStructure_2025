package sort;

import java.util.Arrays;

public class ThreeWayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1, 2, 3, 3, 4,2,1};
		
		threeWayPartition1(arr, 1, 2);
		
		System.out.println(Arrays.toString(arr));

	}

//	public static void threeWayPartition(int[] arr, int lowVal, int highVal) 
//    { 
//          
//        int  n = arr.length; 
//          
//        // Initialize ext available positions for 
//        // smaller (than range) and greater lements 
//        int start = 0, end = n-1; 
//          
//         // Traverse elements from left 
//        for(int i = 0; i <= end;) 
//        { 
//              
//            // If current element is smaller than 
//            // range, put it on next available smaller 
//            // position. 
//              
//            if(arr[i] < lowVal) 
//            { 
//                  
//                int temp = arr[start]; 
//                arr[start] = arr[i]; 
//                arr[i] = temp; 
//                start++; 
//                i++; 
//                  
//            } 
//              
//            // If current element is greater than 
//            // range, put it on next available greater 
//            // position. 
//            else if(arr[i] > highVal) 
//            { 
//                  
//                int temp = arr[end]; 
//                arr[end] = arr[i]; 
//                arr[i] = temp; 
//                end--; 
//                   
//            } 
//              
//            else
//               i++; 
//        } 
        
        
        public static void threeWayPartition1(int[] arr, int lowVal, int highVal) 
        { 
              
            int  n = arr.length; 
              
            
            int low = 0; 
            int mid =0;	
            int high = n-1; 
            
            while( mid<= high)
            {
            	if(arr[mid] <= lowVal)
    			{
    				
    				//swap between low and mid
    				int temp = arr[low];
    				arr[low] = arr[mid];
    				arr[mid] = temp;
    				
    				mid++;
    				low++;
    			}
    			else if(arr[mid] >lowVal && arr[mid] <= highVal )
    			{
    				mid++;
    			}
    			else if(arr[mid] > highVal)
    			{
    				
    				int temp = arr[mid];
    				arr[mid] = arr[high];
    				arr[high] = temp;
    			
    				high--;

    			}
            }
              
//             // Traverse elements from left 
//            for(int i = 0; i <= end;) 
//            { 
//                  
//                // If current element is smaller than 
//                // range, put it on next available smaller 
//                // position. 
//                  
//                if(arr[i] < lowVal) 
//                { 
//                      
//                    int temp = arr[start]; 
//                    arr[start] = arr[i]; 
//                    arr[i] = temp; 
//                    start++; 
//                    i++; 
//                      
//                } 
//                  
//                // If current element is greater than 
//                // range, put it on next available greater 
//                // position. 
//                else if(arr[i] > highVal) 
//                { 
//                      
//                    int temp = arr[end]; 
//                    arr[end] = arr[i]; 
//                    arr[i] = temp; 
//                    end--; 
//                       
//                } 
//                  
//                else
//                   i++; 
//            }  
        
          
    } 
}