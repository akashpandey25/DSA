
import java.util.*;

public class remove_all_occurance_of_a_char_recursion {
    static String removeA2(String str, char s){// without passing index
        if(str.length()==0)return "";
        String smallAns=removeA2(str.substring(1), s);
        char currrChar=str.charAt(0);
        if(currrChar!=s){
            return currrChar+smallAns;
        }
        else
        return smallAns;
    }
    // static String removeA(String str, int idx, char s){// with passing index
    //     if(str.length()==idx){
    //         return " ";
    //     }
    //     String smallAns=removeA(str, idx+1, s);
    //     char currrChar=str.charAt(idx);
    //     if(currrChar!=s){
    //         return currrChar+smallAns;
    //     }else
    //     return smallAns;
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        System.out.println("Enter the char to remove: ");
        char s = sc.next().charAt(0);
        System.out.println(removeA2(str, s));
    }
    
}
