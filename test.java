import java.util.*;
public class test{
     public static void main(String[]args){
          int[]nums = {1,1,2,2,2,3,3,3,4};
          int n = nums.length;

          int i = 0; //for slower loop here i is the left finger point to just unique element
          
          for (int j = 1 ; j < n ; j++){
               if(nums[j] != nums[i]){
                    i++;
                    nums[i] = nums[j];
               }
          }
          System.out.println("unique count" + (i+1));
          System.out.println(Arrays.toString(Arrays.copyOfRange(nums , 0, i+1)));
     }
}