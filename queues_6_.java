public class queues_6_ {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static class queuelink{
        node head=null;
        node tail=null;
        int size=0;
        public void add(int val){
            node temp=new node(val);
            if(head==null&&tail==null){
                tail=temp;
                head=temp;
                tail.next=head;              
            }
            else{
                tail.next=temp;
                tail=temp;
                tail.next=head;
            }
            size++;
        }
        public int remove(){
            int x=-1;
            if(head==null){
                System.out.print("error");
                return x;
            }
            else{
                if(size!=0){
                    x=head.val;
                    head=head.next;
                    tail.next=head;
                    size--;
                }
                return x; 
            }
        }
        public int peek() {
            return tail.val;
        }
        public void print() {
            node temp=head;
            while(true){
                System.out.print(temp.val+" ");
                temp=temp.next;
                if(temp==head)break;
            }
        }
    }
    public static void main(String[] args) {
        queuelink cir=new queuelink();
        cir.add(1);
        cir.add(2);
        cir.add(3);
        cir.add(4);
        cir.print();
    }
}
