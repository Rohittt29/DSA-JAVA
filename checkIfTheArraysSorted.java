public class checkIfTheArraysSorted {
    public static void main(String[]args){
      int nums [] = {1,2,3,4,5};
      int n = nums.length;

      boolean isSorted = true;

      for(int i = 0 ; i < n-1 ; i++){
        if(nums[i] > nums[i+1]){
            isSorted = false;
            break;
        }
      }
      System.out.println("The given arrays sorted " + isSorted);
    }
}