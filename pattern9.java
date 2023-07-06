import java.util.*;
public class pattern9 {
    public static void main(String a[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=l;j++){
                if(i==4 || i+j==5 || j-i==3)
                System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}

