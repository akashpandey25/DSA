import java.util.*;
public class selecttion_sort {
    static void SelectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;  //it will suppose current i as min value and help in further comparing the values
            for(int j=i+1;j<n;j++){  //here iteration starts from i+1 to check the min in next present values
                if(arr[j]<arr[min_index]){  // it compares the value of minindex and current arr[j] 
                    min_index=j;      // if j is less than min index it sets the current minindex as current j(new min value)
                }
            }
            // swap minindex and arr[i] to put min value at right index
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SelectionSort(arr);
        for(int a: arr){
            System.out.print(a+ " ");
        }
        
    }
    
}
