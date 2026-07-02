public class MergeSort {
    public static int[] merge (int[] left , int[] right){
        //creating the blank space:-
        int [] result =new int  [left.length + right.length];
        int i = 0; // pointer at left
        int j = 0; //pointer at right
        int k = 0; //pointer for the result;

        //main loop :-
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                result[k] = left[i];
                i++;
            }
            else{
                result[k] = right[j];
                j++;
            }
            k++;
        }
        //dumping the remaining :-
        while(i < left.length){
            result[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }
}
