import java.util.*;
public class strictly_greaterArray {
    static int greater(int arr [], int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                count++;
            }
        }
        return count;

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
        System.out.println("enter k to find greater: ");
        int k=sc.nextInt();
        System.out.println("total count of numbers which is greater are : " + greater(arr, k));
    }
    
}
