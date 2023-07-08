import java.util.Scanner;
public class find_unique_in_array {
    static int findUnique(int arr[]){
        int n=arr.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=ans;
                    arr[j]=ans;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size=sc.nextInt();
        System.out.print("enter array: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        
        System.out.println("the unique no. is: "+findUnique(arr));
        
        sc.close();
    }
    
}
