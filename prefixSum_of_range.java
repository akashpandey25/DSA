import java.util.*;
public class prefixSum_of_range {
static int[] prefSum(int arr[]){
    int n=arr.length;
    
    for(int i=1;i<n;i++){
        arr[i]=arr[i-1]+arr[i];
    }
    return arr;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of Array: ");
        int n=sc.nextInt();  
        int arr[]=new int[n+1];
        System.out.println("enter Array : ");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
       
        int sum[]=prefSum(arr);
        System.out.println("enter number of queries: ");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("enter range: ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=sum[r]-sum[l-1];
            System.out.println("ans is: "+ ans);

        }
     
        sc.close();
    }
    
    
}
