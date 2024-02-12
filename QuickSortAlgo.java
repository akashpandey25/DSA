import java.util.*;
public class QuickSortAlgo {
    static void Display(int arr[]){
        for(int i:arr){
            System.out.print(i +" ");
        }
    }
    static void swap(int arr[], int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int arr[], int start, int end){
        int pivot=arr[start];  // taking 1st element as our pivote element
        int count=0;  //it will keep the no. of element which is less than pivote
        for(int i=start+1;i<=end;i++){
            if(arr[i]<=pivot) count++; //it will count the no. of element which is less than pivote
        }
        int pivotIdx=start+count;  //this will say the index of pivote element
        swap(arr, start, pivotIdx); //swapping of pivot index and start element for making the correct order in array
        int i=start, j=end;
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i]<=pivot) i++;  //it has used to do not touch the pivote element because it could change the pivote position
            while(arr[j]>pivot) j--;
            if(i<pivotIdx && j>pivotIdx){  //it helps in making change in array- smaller element before pivote and greater element after pivote
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;   //returning the pivote index
    }
    static void quickSort(int arr[], int start, int end){
        if(start>=end) return;    //it's the base case if there is only one element in array
        int pi=partition(arr, start, end);  //this method will give the index of the partition element
        quickSort(arr, start, pi-1);   //this call will run upto start to just before pivote index to sort them
        quickSort(arr, pi+1, end);     //this call will run upto  just after the pivote index to end to sort them
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter the array: ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting");
        Display(arr);
        quickSort(arr, 0, arr.length-1);
        System.out.println();
        System.out.println("Array after sorting");
        Display(arr);
    }
    
}
