import java.util.*;
public class recursiveBinarySearch {
    static boolean recBS(int arr[], int st, int end, int target){
            if(st>end) return false; //base case for recBS
            int mid=st+(end-st)/2;
            if(arr[mid]==target) {return true;}
            else if(arr[mid]>target){
                return recBS(arr, st, mid-1, target);
            }
            else{
               return recBS(arr, mid+1, end, target);
            }   
    }
    public static void main(String[] args) {
        int arr[]={1 ,2, 3, 4, 5};
    
        boolean ans=recBS(arr, 0, arr.length-1, 2);
        System.out.println(ans);

        
    }
    
}
