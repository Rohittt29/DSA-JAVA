import java.util.*;

class Solution {
    public List<Integer> findUnion(int[] arr1, int[] arr2) {

        List<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                if (!union.contains(arr1[i])) {
                    union.add(arr1[i]);
                }
                i++;
            } 
            else if (arr1[i] > arr2[j]) {
                if (!union.contains(arr2[j])) {
                    union.add(arr2[j]);
                }
                j++;
            } 
            else {
                if (!union.contains(arr1[i])) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (!union.contains(arr1[i])) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (!union.contains(arr2[j])) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
}