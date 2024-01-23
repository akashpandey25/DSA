import java.util.*;
public class insertion_sort {
    static void InsertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){ // we are starting loop from index 1 because we are supposing that index 0 is alresdy sorted 
            int j=i;          // it will help in comparing the values
            while(j>0 && arr[j]<arr[j-1]){  //if j is less than j-1 then swapping will happen
                // swap with adjecent to put on correct location
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        InsertionSort(arr);
        for(int a: arr){
            System.out.print(a+ " ");
        }

    
    }
    
}
