import java.util.*;
public class mergeSortAlgo {
    static void Display(int arr[]){  // it will display all the arrays
        for(int n:arr){
            System.out.print(n+ " ");
        }
    }
    static void merge(int arr[], int left, int right, int mid){
        int n1=mid-left+1;   // 0 to mid value length
        int n2=right-mid;    // mid+1 to end length of array
        int arr1[]=new int[n1]; //sub array 1
        int arr2[]=new int[n2]; //sub array 2
        for(int i=0;i<n1;i++){
            arr1[i]=arr[left+i]; //filling to sub array 1
        }
        for(int j=0;j<n2;j++){
            arr2[j]=arr[mid+1+j]; //filling to sub array 1
        }
        int i=0, j=0, k=left;
        while(i<n1 && j<n2){         // checking for min value in both the sub arrays and puting in main array to get in sorted order
            if(arr1[i]<arr2[j]){
                arr[k++]=arr1[i++];
            }
            else{
                arr[k++]=arr2[j++];
            }
        }
        while(i<n1){             //if some values of this subarray is not filled in original array
            arr[k++]=arr1[i++];
        }
        while(j<n2){            // same here also like above
            arr[k++]=arr2[j++];
        }
    }

    static void mergerSort(int arr[], int left, int right){
        if(left>=right) return;   //  in case of single sized array 
        int mid=left+(right-left)/2;   // finding the middle element for the 2 subarrays
        mergerSort(arr, left, mid);   // 1 sub array calling for getting sort
        mergerSort(arr, mid+1, right);  // 2nd subarray calling and sorting
        merge(arr, left, right, mid);   // calling above method to use all the cases for merge sort
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array ");
        Display(arr);
        System.out.println();
        mergerSort(arr, 0, arr.length-1);
        System.out.println("Sorted array ");
        Display(arr);
    }
    
}
