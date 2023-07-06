public class ll{
    private ListNode head;
    public static class ListNode{
        private int data;
        private Listnode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;

        }
        public static void main(String a[]){
            head=new ListNode(11);
            ListNode Second=new ListNode(1);
            ListNode third=new ListNode(3);
            ListNode fourth=new ListNode(8);
            head.next=Second;
            Second.next=third;
            third.next=fourth;
        }
    }
}