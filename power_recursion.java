import java.util.*;
public class power_recursion { //TC  is O(q)
    // static int pow(int p, int q){
    //     if(q==0) return 1;
    //     return p*pow(p, q-1);
    // }
    static int pow(int p, int q){ //efficient time complexity
        if(q==0) return 1;
        int smallPow=pow(p, q/2);
        if(q%2==0)
        return smallPow*smallPow;
          return p*smallPow*smallPow;
    }
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println(pow(p, q));
    }
}
