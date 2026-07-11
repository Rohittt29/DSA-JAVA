import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        
        int i = 0; // slow pointer (keeper)

        for(int j = 1; j < nums.length; j++) { // fast pointer (scout)
            if(nums[j] != nums[i]) {  // found new unique element!
                i++;                   // keeper moves forward
                nums[i] = nums[j];     // keeper takes scout's element
            }
        }

        System.out.println("Unique count = " + (i + 1));
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, i + 1)));
    }
}