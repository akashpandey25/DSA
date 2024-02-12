import java.util.*;
public class BinarySearchAlgo {
    static int binarySearch(int arr[],int n, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2; //it svaes us from integer overflow
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        System.out.println("Enter the array ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target ");
        int target=sc.nextInt();
        int ans=binarySearch(arr, n, target );
        System.out.println(ans);
        

    }
    
}
/*
 * output
Enter the size of array
7
Enter the array
1 2 3 4 5 6 7
Enter the target
2
1
 */