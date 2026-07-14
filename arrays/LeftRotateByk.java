import java.util.*;
public class LeftRotateByk{
    public static void main(String[]args){
        int[]arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;

        // outer loop for k :
        for(int times = 0 ; times < k ; times++){
            int temp = arr[0];

            //inner loop for shifting the element to the left 1 by 1
            for(int i = 1  ; i < n ; i++){
                arr[i-1] = arr[i]; 
            }
            arr[n-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
