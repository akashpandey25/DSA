import java.util.Scanner;
public class find_second_largest {
    //firstly find largest
    static int findLargest(int arr[]){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>ans){
                    ans=arr[i];
                }
            }
        }

        return ans;
    }
    static int secondLargest(int arr []){
        int sl=findLargest(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==sl){
                arr[i]=Integer.MIN_VALUE;
            }
        }
         int secondLargest=findLargest(arr);
         return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("entyer array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("the second largest number is: " + secondLargest(arr));
        sc.close();
    }
    
}
