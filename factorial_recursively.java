import java.util.*;
public class factorial_recursively {
    static int printFact(int n){
        if(n==0 || n==1){
            return 1;
        }
            int k=printFact(n-1);
            int m=n*k;
       
       return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(printFact(n));
    }
}
