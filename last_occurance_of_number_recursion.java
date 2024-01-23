import java.util.*;
public class last_occurance_of_number_recursion {
    static int lastOccurance(int arr[],int idx, int m){
        if(idx==arr.length){
            return -1;
            
        }
        int nextocc=lastOccurance(arr, idx+1, m);// checks the next occu of the element
        if(nextocc!=-1){
            return nextocc;// if the element found later in the array
        }
        if(arr[idx]==m){
            return idx;// found the last occurance
            
            
        }
        
         return -1;// further not found in the array
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int k=sc.nextInt();
        int arr[]=new int[k+1];
        System.out.println("Enter array: ");
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to find last occurance: ");
        int m=sc.nextInt();
       
         System.out.println("The last Occuerance is: "+ lastOccurance(arr, 0, m));

    }
}
