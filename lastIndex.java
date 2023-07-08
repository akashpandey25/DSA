import java.util.*;
class occurance{
   
    
}
public class lastIndex {
     static int number( int arr[], int k){
        int count=-1;
        for(int i=0;i<arr.length;i++){  
            if(arr[i]==k){
                count=i;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter yhe size of array ");
    int n=sc.nextInt();
    int arr[]=new int[n];
     System.out.print("enter array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("enter k to find ");
    int k=sc.nextInt();
    System.out.println("total lastindex of given number is:- " + number(arr, k));
    sc.close();
    }  
}

