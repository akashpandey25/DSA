public class doublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        Node x=new Node(1);
        Node y=new Node(2);
        Node z=new Node(3);
        Node a=new Node(4);
        Node b=new Node(5);
        x.next=y;
        y.prev=x;
        y.next=z;
        z.prev=y;
        z.next=a;
        a.prev=z;
        a.next=b;
        b.prev=a;
        System.out.println(a.prev.val);





    }
}
