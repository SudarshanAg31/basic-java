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
        public void insertInMid(int val,int idx){
            node t=new node(val);
            node temp=head;//to get a address of idx-1 we need to get the value up to there
            if(idx==0){
                insertAtBeg(val);
                return;
            }
            else if(idx==size()-1){
                insertAtEnd(val);
                return;
            }
            else if(idx>=size()){
                System.out.println("idx out of bound");
                return;
            }
            else{
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;//reach to n-1 idx
            }
            t.next=temp.next;//frist we connect n+1 with idx
            temp.next=t;//then we connect n-1 idx with idx
            }
        }
        public void get(int idx){
            node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
        public void deleteAtIdx(int idx){
            node t=head;
            for(int i=1;i<=idx-1;i++){
                t=t.next;
            }
            t.next=t.next.next;
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
        l1.insertInMid(2, 90);
        l1.display();
        l1.get(3);
        l1.deleteAtIdx(3);
        l1.display();
    }
}

