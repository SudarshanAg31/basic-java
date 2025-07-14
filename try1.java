public class try1 {

    public static class node{
       int data;
       node next;
       public node(int data){
        this.data=data;
       } 
    }

    public static class linklist{
        node head=null;
        node tail=null;
        public void insertAtEnd(int val){
            node temp =new node(val);
            if(head==null){
                head=temp;
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
        public void insertAtBeg(int val){
            node temp =new node(val);
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
            node temp=new node(val);
            node t=head;
            for(int i=1;i<=idx-1;i++){
                t=t.next;
            }
            temp.next=t.next;
            t.next=temp;
        }
        public void get(int idx){
            node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
        public void deleteAtIdx(int idx){
            node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        public void size(){
            node temp=head;
            int count=0;
            while(temp!=null){
                temp=temp.next;
                count++;
            }
            System.out.println(count);
        }

    }
    public static void main(String[] args) {
        linklist l1=new linklist();
        l1.insertAtEnd(5);
        l1.insertAtEnd(4);
        l1.insertAtEnd(3);
        l1.insertAtEnd(2);
        l1.insertAtEnd(1);
        l1.display();
        l1.insertAtBeg(-5);
        l1.insertAtBeg(-4);
        l1.insertAtBeg(-3);
        l1.insertAtBeg(-2);
        l1.insertAtBeg(-1);
        l1.display();
        l1.insertInMid(0, 3);
        l1.display();
        l1.get(3);
        l1.deleteAtIdx(3);
        l1.display();
        l1.size();
        l1.get(0);
    }
}