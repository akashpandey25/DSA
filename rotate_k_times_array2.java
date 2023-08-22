
import java.util.Scanner;
public class rotate_k_times_array2 {
    static void rotate(int arr[], int k){
        int n=arr.length;
         k=k%n;
        for(int i=n-k;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        for(int i=0;i<n-k;i++){
            System.out.print(arr[i]+" ");
        }
        
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
        rotate(arr,k);
        sc.close();
    }
    
}
