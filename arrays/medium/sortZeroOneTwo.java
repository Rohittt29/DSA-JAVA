import java.util.Scanner;

public class sortZeroOneTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter array elements (0, 1, 2):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Count 0's, 1's and 2's
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // Fill the array again
        int index = 0;

        while (count0 > 0) {
            nums[index] = 0;
            index++;
            count0--;
        }

        while (count1 > 0) {
            nums[index] = 1;
            index++;
            count1--;
        }

        while (count2 > 0) {
            nums[index] = 2;
            index++;
            count2--;
        }

        // Print sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}