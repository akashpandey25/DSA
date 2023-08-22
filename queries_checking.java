/*check the given number is present in array or not */
import java.util.Scanner;
public class queries_checking {
    static int[] checkFreq(int arr[]){
        int n=arr.length;
        int freq[]=new int[100005];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        return freq;
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
        int freq[]=checkFreq(arr);
        System.out.println("enter number of queries: ");
        int k=sc.nextInt();
        while(k>0){
            System.out.print("enter nuber to be searched: ");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }
            else
                 System.out.println("No");
                 k--;


        }
   
        sc.close();
    }
    
}
