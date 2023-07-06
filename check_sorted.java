import java.util.*;
public class check_sorted {
    static boolean isSorted(int arr[], int k){
        boolean check=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                check=false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size if array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(" sorted checking  : "+ isSorted(arr, n));
    }
    
}
