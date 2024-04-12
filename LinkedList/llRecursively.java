public class llRecursively {
    static void Display(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        Display(head.next);
    }
    public static class Node{
        int data;
        Node next; //Node is like a dataType taken from class name
        Node(int data){//Constructer of this class
           this.data=data;
        }
   }
   public static int length(Node head){ //it will count the length of the LInkedList
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
   }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        // Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        // d.next=e;
        Display(a);
        System.out.println();
        System.out.println(length(a));
        
    }
    
}
