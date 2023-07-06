
import java.util.*;
public class pattern8{
    public static void main(String a[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=l;j++){
                if((i+j)%2==0)
                System.out.print(1);
                else
                    System.out.print(2);
            }
            System.out.println();
        }
    }
    
}

