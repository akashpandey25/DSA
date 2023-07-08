import java.util.Scanner;
public class target_sum {
    static int pairSum(int arr[], int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
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
        System.out.println("enter target: ");
        int target=sc.nextInt();
        System.out.println("total count of pairs which helps in making target is: "+ pairSum(arr, target));
        
        sc.close();

    }
    
}
