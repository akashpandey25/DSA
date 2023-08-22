import java.util.*;
public class prefixSum {
static void prefSum(int arr[]){
    int n=arr.length;
    
    for(int i=1;i<n;i++){
        arr[i]=arr[i-1]+arr[i];
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of Array: ");
        int n=sc.nextInt();  
        int arr[]=new int[n];
        System.out.println("enter Array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
        prefSum(arr);
        
        for(int i=0;i<n;i++){
            
            System.out.print(arr[i]+" ");
          
        }
        System.out.println();
        
        sc.close();
    }
    
    
}
