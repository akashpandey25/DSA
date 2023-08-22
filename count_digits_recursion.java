import java.util.*;
public class count_digits_recursion {
    static int countDigit(int n){
        int c=0;
        if(n>=0 && n<=9){
            return 1;
        }
        c=countDigit(n%10)+countDigit(n/10);
        //  countDigit(n/10);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countDigit(n));
    }
    
}
