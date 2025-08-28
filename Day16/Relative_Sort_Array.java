package Day16;

import java.util.*;

public class Relative_Sort_Array {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[arr1.length];
        int index = 0;
        for (int num : arr2) {
            int count = freq.getOrDefault(num, 0);
            while (count-- > 0) {
                result[index++] = num;
            }
            freq.remove(num); 
        }

        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            while (count-- > 0) {
                remaining.add(num);
            }
        }

        Collections.sort(remaining);

        for (int num : remaining) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};

        int[] result = relativeSortArray(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}

