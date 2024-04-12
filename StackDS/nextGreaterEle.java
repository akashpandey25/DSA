import java.util.Scanner;
import java.util.Stack;

public class nextGreaterEle {
    public static int[] greater(int arr[]){
        int n=arr.length;
        int res[]=new int [n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i] ){
                st.pop();
            }
            if(st.size()==0) res[i]=-1;
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("ele for array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k[]=greater(arr);
        System.out.println("next greater element: ");
        for(int num:k){
            System.out.print(num+" ");
        }
        System.out.println();
        
    }
    
}
