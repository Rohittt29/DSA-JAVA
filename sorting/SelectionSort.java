import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        int n = arr.length;


        //outerloop:-
        for (int i = 0 ; i < n-1 ; i++){
            int minIndex = i;
        //innerloop:-
            for(int j = i+1 ; j < n ; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            //swapping:-
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}