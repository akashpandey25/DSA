import java.util.Scanner;
public class reverseArray {
    static void reverse2(int arr[]){ //1st technique to solve
        int n=arr.length;
        int i=n-1, j=0;
        int ans[]=new int [n];
        while(i>=0){
            ans[j++]=arr[i--];
        }
    }
    static void reverse(int arr[]){ //2nd technique to solve
         int n=arr.length;
        // int ans[]=new int[n]; //after creating new array
        //   int j=0;   //after creating new array
        for(int i=n-1;i>=0;i--){
            // ans[j++]=arr[i];    //after creating new array
            System.out.print(arr[i]+ " ");   //without creating new array
        }
        // return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int k=sc.nextInt();
        int arr[]=new int[k];
        System.out.println("enter array: ");
        for(int i=0;i<k;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("the reversed array is: ");
        reverse(arr); //without creating new array
        // int ans[]=reverse(arr); //after creating new array
        // for(int i=0;i<ans.length;i++){ //after creating new array
        //     System.out.print(ans[i] + " "); //after creating new array
        // }
        // System.out.println(); //after creating new array
        sc.close();

    }
    
}
