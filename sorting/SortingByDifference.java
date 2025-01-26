package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingByDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 7;
		int arr[] = {10, 5, 3, 9, 2};
		
		sortingByDifference(arr,arr.length,x);
		

	}
	
	public static void sortingByDifference(int arr[],int n,int diff)
	{
		TreeMap<Integer,Integer> map = new TreeMap<>();
		
		for(int i=0;i<n;i++)
		{
			map.put(arr[i], Math.abs( diff-arr[i] ) );
		}
		System.out.println(map.toString());
		
		
		List <Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		
		
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2)
			{
				return e1.getValue() - e2.getValue();
			}
		});

		Collections.sort(list, (Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) -> e1.getValue() - e2.getValue());
		
		
		//List <Entry<Integer, Integer>> sortedSet = list;
		
		for(Entry<Integer, Integer> each : list )
		{
			System.out.println( each.getKey());
		}
		
		
		

	}
	
	

}




