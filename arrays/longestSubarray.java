public class longestSubarray {
public static int longestSubarray(int[] arr, int k) {

    int n = arr.length;

    int i = 0;
    int j = 0;

    int sum = arr[0];
    int maxLen = 0;

    while (j < n) {

        while (i <= j && sum > k) {
            sum -= arr[i];
            i++;
        }

        if (sum == k) {
            maxLen = Math.max(maxLen, j - i + 1);
        }

        j++;

        if (j < n) {
            sum += arr[j];
        }
    }

    return maxLen;
}

}