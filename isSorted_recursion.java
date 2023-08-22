import java.util.*;
public class isSorted_recursion {
    static boolean checkSorted(int arr[], int idx, boolean inc){
        
        if(idx>=arr.length-1){
            return true;
        }
        if(inc){
             if(arr[idx]<arr[idx+1]){
             return false;
                }
         }
         else{
            if(arr[idx]>arr[idx+1]){
                return false;
            }
         }
        return checkSorted(arr, idx+1, inc);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(checkSorted(arr, 0, true)||checkSorted(arr, 0, false)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
