import java.util.*;
public class pattern5 {
     public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int l=1;l<=(2*i-1);l++){
            System.out.print( "*");
            }
            System.out.println();
        }
    }
}
