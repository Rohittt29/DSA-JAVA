import java.util.*;
public class test{
     public int[] twoSum(int[] nums, int target){
          HashMap<Integer,Integer> map = new HashMap<>();
          int n = nums.length;
          for(int i = 0; i < n; i++){
               int need = target - nums[i];
               if(map.containsKey(need)){
                    //if yes then return the ans:-
                    return new int[]{map.get(need), i};
               }
               //if no then store the current that is nums[i] in the map:-
               map.put(nums[i], i);
          }
          return new int[]{};
     }

     public static void main(String[]args){

     }
}