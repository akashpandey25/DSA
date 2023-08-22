import java.util.Scanner;
public class reverseArray_usingSwap {
    static void swapArray(int arr[], int i,int j){
            int temp=0;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
    static void reverseArray(int arr[]){
        int n=arr.length;
        int i=0,  j=n-1;
        while(i<j){
            swapArray(arr,  i,  j);
                i++;
                j--;  
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int k=sc.nextInt();
        int arr[]=new int[k];
        System.out.println("enter array: ");
        for(int i=0;i<k;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("the reversed array is: " );
        reverseArray(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
    
}
