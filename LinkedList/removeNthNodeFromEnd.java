
public class removeNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node removeNode(Node head, int pos){
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=pos;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        // Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        a=removeNode(a, 5); //storing the current valaue of head
        display(a);
        
    }
}
