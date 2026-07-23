class longestSubarray2 {
    public int longestSubarray2(int[] nums, int k) {

        int left = 0;
        int right = 0;

        int sum = 0;
        int maxLen = 0;

        while (right < nums.length) {

            // Expand the window
            sum += nums[right];

            // Shrink the window if sum becomes greater than k
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            // Check if current window has sum == k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move right pointer
            right++;
        }

        return maxLen;
    }
}