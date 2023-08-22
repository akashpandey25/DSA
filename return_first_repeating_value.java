import java.util.Scanner;
public class return_first_repeating_value {

    static int findRepeating(int arr[]){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];// for first repeating
                   // ans=arr[i]; //for last repeating
                   // break;
                }
            }
        }

        return ans;
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
        
        System.out.println("the first repeated number is: " + findRepeating(arr));
        sc.close();
    }
    
}

