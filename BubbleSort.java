import java.util.Arrays;

public class BubbleSort {
    public static void main(String[]args){
        int arr[] = {2,5,1,8,4,7,9,0};
        int n = arr.length;

        //outerloop:
        for(int i = 0 ; i < n - 1 ; i++){

            //innerloop:
            for(int j = 0 ; j < n-1-i ; j++) {
                //comparing the side element :
                if (arr[j] > arr[j + 1]) {
                    //swaping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
