public class test {
    public static void main(String[]args){
    //finding the largest number :- 
    int arr [] = {57,1,0,10,99,3,2,6,104,7};
    int n = arr.length;
    int max = arr[0];
    for (int i = 0 ; i < n ; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    System.out.println("MAX :" + max);
}
}
