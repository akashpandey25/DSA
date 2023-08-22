import java.util.*;
public class square_of_each_no_in_sorted_order {
    static void reverse2(int arr[]){ 
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+ " ");   
        }
    }
    static int[] squareAndSorted(int arr[]){
        int n=arr.length;
        int left=0, right=n-1, k=0; //if k=n-1 then we need not to run reverse function
        int ans[]=new int[n];
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left]; //k-- it does that starts filling the value from last
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right]; //k--
                right--;
            }
        }
       return ans;
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
       
        int ans[]=squareAndSorted(arr);
        
        for(int i=0;i<n;i++){
            
            System.out.print(ans[i]+" ");
          
        }
        System.out.println();
        reverse2(ans);
        sc.close();
    }
    
}
