public class missingNumber{
    public static void main(String[]args){
        int [] arr = {1,2,4,5};
        int n = arr.length;

        int expectedsum = (n+1)*(n+2)/2;

        int actualsum = 0;
        for(int i  = 0 ; i < n ; i++){
            actualsum += arr[i];
        }
        System.out.println("missing number is :" + (expectedsum - actualsum));
    }
}