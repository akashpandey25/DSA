
import java.util.Scanner;
public class rotate_k_times_array {
    static int[] rotate(int arr[], int k){
        int n=arr.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
                ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("enter array: ");
        for(int i=0;i<s;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("enter value to totate: ");
        int k=sc.nextInt();
       
        System.out.println("the reversed array is: ");
        int ans[]=rotate(arr,k);
        for(int i=0;i<s;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println( );
        sc.close();
    }
    
}
