import java.util.*;
public class KthLargestArray {
    static int largest(int arr[],int k){
        Arrays.sort(arr);
         int ans=arr[arr.length-k]; //for kth largest
        // int ans=arr[k-1]; //for kth smallest
        
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size if array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("enter k");
         int k=sc.nextInt();
        System.out.println("kth largest array is  : "+ largest(arr,k));
    }
    
}

