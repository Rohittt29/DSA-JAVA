import java.util.*;
public class UnionOfSortedArrays {
 public static void main(String[]args){
    int [] arr1 = {1, 2, 3, 4, 5};
    int [] arr2 = {1, 2, 7}; 
    int n1 = arr1.length;
    int n2 = arr2.length;

    ArrayList<Integer>result = new ArrayList<>();

    int i = 0;
    int j = 0;

    while(i<n1 && j<n2){
        if(arr1[i] < arr2[j]){
            result.add(arr1[i]);
            i++;
        }
        else if(arr1[i]>arr2[j]){
            result.add(arr2[j]);
            j++;
        }
        else{
            result.add(arr1[i]);
            i++;
            j++;
        }
    }
    //dumping the rest of the elements from the both i and j into result.
    while(i<n1){
        result.add(arr1[i]);
        i++;
    }
    while(j<n2){
        result.add(arr2[j]);
        j++;
    }

    System.out.println(result);

 }
    
}