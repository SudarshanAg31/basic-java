public class linklist_5_ {
    public static class node{
        int data;
        node next;
        public node(int data) {
        this.data=data;
        }
    }
    public static class linklist{
        node head=null;//node head is just like a varible which hold the property of node class
        node tail=null;
        public void insertAtEnd(int val) {
            node temp=new node(val);
            if(head==null){
                head=temp;//it only transfer address
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        public void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public int size(){
            node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        public void insertAtBeg(int val){
            node temp=new node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        public void insertInMid(int idx,int val){
            node temp=new node(val);
            node t=head;
            for(int i=0;i<idx-1;i++){
                t=t.next;
            }
            temp.next=t.next;
            t.next=temp;
        }
    }
    public static void main(String[] args) {
        linklist l1=new linklist();
        l1.insertAtEnd(5);
        l1.insertAtEnd(2);
        l1.insertAtEnd(4);
        l1.display();
        System.out.println(l1.size());
        l1.insertAtBeg(10);
        l1.display();
        l1.insertInMid(2, 10);
        l1.display();
    }
}
