import java.util.*;
public class reverse_netural_no_recursion {
    static void printIncreasing(int n){
        System.out.println(n);
       
         if(n>1){
            printIncreasing(n-1);
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);
        
    }
    
}
