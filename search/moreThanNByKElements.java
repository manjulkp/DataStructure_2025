package search;

import java.util.*;
import java.util.Map.Entry;

public class moreThanNByKElements {


    public static void nByKElements(int arr[] , int n, int k){
        List<Integer> list = new ArrayList<>();
        int x = n/k;

        Map<Integer,Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num,map.getOrDefault(num , 0)+1);
        }

        for(Entry<Integer,Integer> each : map.entrySet()){
            if(each.getValue()>=x){
                list.add(each.getKey());
            }
        }

        System.out.println(list);
    }
    
}


