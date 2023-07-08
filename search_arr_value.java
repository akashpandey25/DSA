
class arr{

    void search_arr(){
        int arr[]={1,2,3,4,5,6,10,12,15};
        int k=5;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                ans=i;
                break;
            }
            
        }
        System.out.println("found "+k+" at index "+ans );

    }
}
public class search_arr_value {
    public static void main(String[] args) {
        arr obj=new arr();
        obj.search_arr();
        
    }
    
}
