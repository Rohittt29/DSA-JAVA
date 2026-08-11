public class sortZeroOneTwo{
    public void sortZeroOneTwosol(int[]nums){
          int n = nums.length;
          int count0 = 0;
          int count1 = 0;
          int count2 = 0;
          for(int i = 0 ; i < n; i++){
            if(nums[i] == 0){
                count0++;
            }
            else if (nums[i] == 1){
                count1++;
            }
            else{
                count2++;
            }
          }

          int index = 0;
          while(count0 > 0){
            nums[index] = 0;
            index++;
            count0--;
          }
          while(count1 > 0){
            nums[index] = 1;
            index++;
            count1--;
          }
          while(count2 > 0 ){
            nums[index] = 2 ;
            index++ ;
            count2--;
          }
    }

    public static void main(String[]args){
        int [] nums = {1,0,2,0,1,0,1,2,0};
        sortZeroOneTwo obj = new sortZeroOneTwo();
        obj.sortZeroOneTwosol(nums);

        for(int i = 0 ; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }
}