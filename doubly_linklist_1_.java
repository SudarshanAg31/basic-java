public class doubly_linklist_1_ {
    public static class node{
        int data;
        node next;
        node prev;
        public node(int data){
            this.data=data;
        }
    }
    public static void display_rev(node n5) {
        node temp= n5;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
    public static void display(node n1) {
        node temp =n1;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void display_any(node n3) {
        node temp =n3;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void addAt(node n1,int val,int idx) {
        node t=new node(val);
        node temp=n1;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
        t.next.prev=t;
        t.prev=temp;
    }
    public static node insert_beg(node n1,int val){
        node temp =new node(val);
        temp.next=n1;
        n1.prev=temp;
        n1=temp;
        return n1;
    }
    public static void delete(node n1,int idx) {
        for(int i=1;i<=idx-1;i++){
            n1=n1.next;
        }        
        n1.next=n1.next.next;
        n1.next.next.prev=n1.next.prev;
    }
    public static void main(String[] args) {
        node n1= new node(1);
        node n2= new node(2);
        node n3= new node(3);
        node n4= new node(4);
        node n5= new node(5);
  
        n1.prev=null;
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        n3.next=n4;
        n4.prev=n3;
        n4.next=n5;
        n5.prev=n4;
        n5.next=null;
        display(n1);
        System.out.println();
        display_rev(n5);
        System.out.println();
        display_any(n3);
        addAt(n1, 10, 3);
        System.out.println();
        display(n1);
        node h1=insert_beg(n1, 10);
        System.out.println();
        display(h1);
        delete(n1, 2);
        System.out.println();
        display(h1);

    }
}
