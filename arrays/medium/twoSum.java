import java.util.HashMap;
import java.util.Scanner;

public class twoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Create HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Two Sum Logic
        for (int i = 0; i < n; i++) {

            int need = target - nums[i];

            if (map.containsKey(need)) {
                System.out.println("Indices: " + map.get(need) + " " + i);
                sc.close();
                return;
            }

            map.put(nums[i], i);
        }

        System.out.println("No pair found.");

        sc.close();
    }
}