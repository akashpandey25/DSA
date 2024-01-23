import java.util.*;
public class pallindrome_recursion {
    static boolean isPallindrome(String s, int l, int r){ //without using reverse method
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && isPallindrome(s, l+1, r-1));

    }
    // static String pallindrome(String s, int idx){ //with reverse method
    //     if(idx==s.length())return "";
    //     String smallAns=pallindrome(s, idx+1);
    //     return smallAns+ s.charAt(idx);
    // }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // String rev=pallindrome(s, 0);
        // if(rev.equals(s)){
        //     System.out.println("pallindrome");
        // }
        // else{
        //     System.out.println("Not pallindrome");
        // }
        System.out.println(isPallindrome(s, 0, s.length()-1));

    }
    
}
