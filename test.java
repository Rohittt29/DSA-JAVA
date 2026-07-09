public class test{
    public static void main(String[]args){
        int [] arr = {3,1,2,5,9,7,8};
        int n = arr.length;

        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > largest){
                
                secondlargest = largest;
                largest  = arr[i];
            }
            else if (arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i];
            }
        }
        System.out.println("The second largest element is :" + secondlargest);
    }
}