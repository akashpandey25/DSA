/* finding best minimum cost to reach from initial stone to targated stone
    can move only i+1 or i+12 steps from initial.
*/
import java.util.*;
public class frog_jump {
    static int bestCost(int h[], int n, int idx){
        if(idx==n-1) return 0; //when you are on the target
        int op1=Math.abs(h[idx]-h[idx+1])+bestCost(h, n, idx+1);//for jumping i+1
        if(idx==n-2) return op1;// when you are just before the target value
        int op2=Math.abs(h[idx]-h[idx+2])+ bestCost(h, n ,idx+2);//for jumping i+2
        return Math.min(op1, op2);//min value to get best min cost
    }
    public static void main(String[] args) {
        int h[]={10,30,40,20};
        System.out.println(bestCost(h, h.length, 0));
    }
    
}
