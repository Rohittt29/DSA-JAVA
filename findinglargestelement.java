public class test{
    public static void main(String[]args){
        int [] arr = {2,3,5,1,4};
        int n = arr.length;
        int max = arr[0];

        for(int i = 0; i < n; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("MAX ELEMENT IS : " + max);
    }
}