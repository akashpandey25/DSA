import java.util.*;
public class array_recursion {
    static void printArray(int arr[], int idx){
        //base case
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3,4 ,5 ,6 ,7, 87, 98};
        printArray(arr, 0);
    }
    
}
