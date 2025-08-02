public class queues_4_ {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static class queue{
        node head=null;
        node tail=null;
        int size=0;
        public void add(int val) {
            node temp=new node(val);
            if(size==0){
                head=tail=temp;
            }
            else{
            tail.next=temp;
            tail=temp;
            }
        size++;
        }
        public int peek(){
            return head.val;
        }
        public  int remove() {
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        public void display() {
            node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public  int size() {
            return size;
        }
    }
    public static void main(String[] args) {
        queue q1=new queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.display();
        q1.remove();
        q1.display();
        System.out.println(q1.peek());
        System.out.println(q1.size());
    }
}
