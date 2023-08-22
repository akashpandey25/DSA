import java.util.*;
public class ArrayList_reverse {
    static void reverse(ArrayList<Integer> list){
        int i=0, j=list.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i, temp);
            list.set(j, temp);
            i++;
            j++;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(i);
        }
        
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }
    
}
