import java.util.Scanner;
public class binaryToDecimal {
    public  static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int binaryNumber=sc.nextInt();
        int ans=0;
        int power=1; //2^0=1
        while(binaryNumber>0){
            int unitDigit=binaryNumber%10;
            ans += (unitDigit*power);
            binaryNumber/=10;
            power*=2;
        }
        System.out.println(ans);
        sc.close();
    }
    
}
