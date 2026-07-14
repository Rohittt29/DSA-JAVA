public class LinearSearch {
    public static void main(String[]args){
        int [] arr = {1,2,0,5,9,6,69};
        int target = 9;

        //use the method we have created:-
        System.out.println(search(arr,target));
    }
    
    
    
    public static int search(int[]arr, int target){
        int n = arr.length;
        for(int i = 0; i<n ; i++){
            if(arr[i] == target){
                return i ;
            }
        }
        return -1;
    }
}
