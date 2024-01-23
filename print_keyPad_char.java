public class print_keyPad_char {
    static void combination(String dig, String kp[], String res){
        if(dig.length()==0){
            System.out.println(res+" ");
            return;
        }
        int currNum=dig.charAt(0)-'0';
        String currChoices=kp[currNum];
        for(int i=0;i<currChoices.length();i++){
            combination(dig.substring(1), kp, res+currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s= "21";
        String kp[]={"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        combination(s, kp, "");
    }
    
}
