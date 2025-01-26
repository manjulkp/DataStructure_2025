package search;

import java.util.*;

public class AvoidFloodInCity {
    public static int[] avoidFlood(int[] rains) {
        Map<Integer, Integer> fullLakes = new HashMap<>(); // Tracks the last filled day for each lake
        TreeSet<Integer> dryDays = new TreeSet<>(); // Tracks available dry days
        int[] ans = new int[rains.length];
        Arrays.fill(ans, 1); // Default dry day action (can choose any lake to dry)

        for (int i = 0; i < rains.length; i++) {
            if (rains[i] > 0) { // It rains on lake rains[i]
                int lake = rains[i];
                if (fullLakes.containsKey(lake)) {
                    // This lake is already full; find a dry day to dry it
                    Integer dryDay = dryDays.ceiling(fullLakes.get(lake)); // Find the next dry day after lake was filled
                    if (dryDay == null) {
                        // No dry day available, flood is unavoidable
                        return new int[0];
                    }
                    ans[dryDay] = lake; // Use this dry day to dry the lake
                    dryDays.remove(dryDay); // Remove this dry day from the available set
                }

                fullLakes.put(lake, i); // Update the last filled day for this lake
                ans[i] = -1; // Mark as rain day
            } else {
                // It's a dry day
                dryDays.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // int[] rains = {1, 2, 3, 4};
        // System.out.println(Arrays.toString(avoidFlood(rains))); // Output: [-1, -1, -1, -1]

        int[] rains2 = {1, 2, 0,0, 1, 2};
        System.out.println(Arrays.toString(avoidFlood(rains2))); // Output: [-1, -1, 2, -1, -1]
    }
}
