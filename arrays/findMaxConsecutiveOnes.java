import java.util.*;
public class findMaxConsecutiveOnes {
    public static void main(String[]args){
        int [] nums = {1,1,0,1,1,1};
        
        int n = nums.length;
        int count = 0;
        int maxCount = 0;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 1){
                count = count +1;
            }
            else{
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }
}
