import java.util.*;
public class equalPartition {
    static int findSum(int arr[]){
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }
    static boolean arrayPartition(int arr[]){
        int totalsum=findSum(arr);
        int prefsum=0;
        for(int i=0;i<arr.length;i++){
            prefsum+=arr[i];
            int suffixsum=totalsum-prefsum;
            if(prefsum==suffixsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of Array: ");
        int n=sc.nextInt();  
        int arr[]=new int[n+1];
        System.out.println("enter Array : ");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println(" ans is: "+arrayPartition(arr));
        
        
    }
    
}
