public class singleNumber {
    public static void main(String []args){
        int [] nums = {1,1,2,3,3,2,69,4,8,4,8};
        
        int n = nums.length;
        int result = 0;
        
        for(int i = 0 ; i<n ; i++){
            result = result ^ nums[i];
        }
        System.out.println(result);
    }
}
