import java.util.*;
public class bubble_sort {
    static void BubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){ //loop will run (n-1) times because need not to run loop for the last element
            boolean Flag=false; // it will check has any swapping happend
            for(int j=0;j<n-i-1;j++){ // do not need to use the already sorted element so we used (n-i-1) times loop only runs on unsorted element
                   if(arr[j]>arr[j+1]){
                        //swap them
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                   }                               

            }
            if(!Flag){ // have any swapping happend?
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       BubbleSort(arr);
       for(int a:arr){
        System.out.print(a+ " ");
       }
        
    }
    
}
