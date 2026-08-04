import java.util.*;
class Solution {
    public int Kadanes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(sol.Kadanes(nums));
    }
}