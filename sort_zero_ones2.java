import java.util.*;
public class sort_zero_ones2 {
    static void swap(int arr[],int left, int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void sortArray(int arr[]){
        int n=arr.length;
        int left=0, right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left, right);
                left++;
                right--; 
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of Array: ");
        int n=sc.nextInt();  
        int arr[]=new int[n];
        System.out.println("enter Array only zeros ans ones: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortArray(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
    
}
