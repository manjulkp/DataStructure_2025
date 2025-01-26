package sort;

import java.util.Arrays;

public class ThreeTypeElements__Segregation_Sorting_DutchFlag {

	/*
	 * This discusses a famous interview problem in which you need to
	 * segregate an array of elements containing three types of elements. The types
	 * are:
	 * 
	 * Sort an array of 0s, 1s, 2s. Three-way partitioning when multiple occurrences
	 * of a pivot may exist. Partitioning around a range.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,0,2,1,0,0,1,2,1};
		int n = arr.length;
		
		sort(arr,n);
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static void sort(int arr[],int n)
	{
		
//		 All between 0 -- (low -1) is having 0
//		 low to mid-1 ---- is having 1
//		 mid to high ------unknow 
//		 high+1 to end is 2 
		
		int low =0;
		int mid =0;
		int high = n-1;
		
		// start with mid
		while(mid <= high)
		{
			if(arr[mid] == 0)
			{
				
				//swap between low and mid
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				
				mid++;
				low++;
			}
			else if(arr[mid] == 1)
			{
				mid++;
			}
			else if(arr[mid] == 2)
			{
				
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
			
				high--;

			}
		}
		
	}

}
