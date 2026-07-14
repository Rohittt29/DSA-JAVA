import java.util.*;
public class MoveZeros  {
  public static void main(String [] args){
    int arr[] = {0, 1, 0, 3, 12};
    int n = arr.length;
    
    int i = 0;
    for(int j = 0 ; j < n ; j++){
        if(arr[j] != 0 ){
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
  }
}
