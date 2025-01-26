package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;



public class MergeOverlappingInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		input  : {1,3}{2,4}{5,7}{6,8}
//		output :  {1,4}{5,8}

		// produce an output that do not over lap

		Interval arr[] = new Interval[4];
		arr[0] = new Interval(6, 8);
		arr[1] = new Interval(1, 9);
		arr[2] = new Interval(2, 4);
		arr[3] = new Interval(4, 7);

		int n = arr.length;

		//merge(arr, n);
		
		// Given set of interval
//	    int[][] arr1 = { { 1, 3 },
//	                    { 2, 4 },
//	                    { 3, 5 },
//	                    { 7, 9 } };
	    
	    Interval arr1[] = new Interval[4];
		arr1[0] = new Interval(1,3);
		arr1[1] = new Interval(2,4);
		arr1[2] = new Interval(3,5);
		arr1[3] = new Interval(7,9);
		
	  
	   // int N = arr.length;
	    
	    nonOverlapping(arr1, n);
	}

	private static void merge(Interval[] arr, int n) {

		Arrays.sort(arr, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {

				return o1.start - o2.start;
			}
		});
		
		Arrays.sort(arr,(a,b)->Integer.compare(a.start,b.start));
		
		System.out.println(Arrays.toString(arr));

		 List<Interval> mergedIntervals = new LinkedList<Interval>();
		 
		int start = arr[0].start;
		int end = arr[0].end;
		
		// Assume first Interval is merged
		for (int i = 1; i < n; i++) {
			
			if (arr[i].start <= end) { // overlapping intervals, adjust the 'end'
		        end = Math.max(arr[i].end, end);
		      } else { // non-overlapping interval, add the previous interval and reset
		        mergedIntervals.add(new Interval(start, end));
		        start = arr[i].start;
		        end = arr[i].end;
		      }
		    }
		    // add the last interval
		    mergedIntervals.add(new Interval(start, end));

	}
	
	/*
	 * print the non overlapping interval 
	 */
	
	
	private static void nonOverlapping(Interval[] arr, int n) {

		Arrays.sort(arr, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {

				return o1.start - o2.start;
			}
		});
		
		Arrays.sort(arr,(a,b)->Integer.compare(a.start,b.start));
		
		System.out.println(Arrays.toString(arr));
		
 List<Interval> list = new ArrayList<>();
 
		
		// Assume first Interval is merged
		for (int i = 1; i < n; i++) {
			if ( arr[i].start > arr[i-1].end) {
				
				list.add(new Interval( arr[i-1].end, arr[i].start));

			}

		}

		for (int i = 0; i < list.size(); i++) {
			
			System.out.println("("+list.get(i).start+","+list.get(i).end+") ");

		}

	}
	
	
	
	
	/*
	 * non overlapping  --remove the overlapping interval
	 */
	
	/*
	 * [[1,2],[2,3],[3,4],[1,3]]
	 */
	public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        final int N = intervals.length;
        // Sort intervals by end index from low to high
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[1], i2[1]));
        
        int count = 0;
        int end = intervals[0][1];
        //right = arr[0].end;
        for (int i = 1; i < N; i++) {
            if (intervals[i][0] < end) {
                count++;
            } else {
                end = intervals[i][1];
            }
        }
        return count;
    }

}




