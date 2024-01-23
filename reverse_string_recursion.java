import java.util.*;
public class reverse_string_recursion {
    static String reverse(String s, int idx){
        if(s.length()==idx) return "";
        String smallAns=reverse(s, idx+1);
        return smallAns+ s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        System.out.println("The reversed String are: ");
        System.out.println(reverse(s, 0));
    }
    
}
