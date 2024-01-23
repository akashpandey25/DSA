import java.util.*;
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int z=nums.size();
        // List <Ineger> l1=new ArrayList<> ();
        int l2[]=new int[z];
        int finalans=0;
        for(int i=0;i<z;i++){
            int p=1;
           
            int ans=0;
            while(i>0){
                int sol=i%2;
                ans+=(sol*p);
                p*=10;
                i/=2;
            }
           l2[i++]=ans;
        }    
            for(int j=0;j<z;j++){
                int l=0;
                int t=l2[j];
                 while(t>0){
                    int d=t%10;
                    l+=d;
                    j/=10;
                    
                }
               
                if(l==k){
                    finalans+=nums.get(j);

                }

            }
        return finalans;
        
    }
}
public class sum_of_bits {
    public static void main(String[] args) {
            
    }
    
}
