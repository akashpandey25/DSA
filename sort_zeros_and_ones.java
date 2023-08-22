import java.util.Scanner;
public class sort_zeros_and_ones {
    static void sort(int arr[]){
        int n=arr.length;
        int zeros=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeros){
                arr[i]=0;
            }
            else
                arr[i]=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("enter array: ");
        for(int i=0;i<s;i++){
        arr[i]=sc.nextInt();
        }
        sort(arr);
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+ " ");
        }
       
       
       
        sc.close();
    }
    
}
