//Given a number n, print the following pattern without using any loop.
//n, n-5, n-10, ..., 0, 5, 10, ..., n-5, n
import java.util.*;
public class assignment_recursion {
    static void printPattern(int n, int m, boolean flag){
        System.out.print(m+" ");
        if(n==m && flag==false){
            return;
        }
        if(flag){
            if(m-5>0){
                printPattern(n, m-5, true);
            }
            else{
                printPattern(n, m-5, false);
            }
        }
        else{
            printPattern(n, m+5, false);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    printPattern(n, n, true);
    }
    
}
