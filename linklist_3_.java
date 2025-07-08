public class linklist_3_ {
    public static void print(node n1) {
        node temp=n1;
        if(temp==null){
            return;
        }
        System.out.println(temp.data);
        print(temp.next);
    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node n1=new node(1);
        node n2=new node(2);
        node n3=new node(3);
        node n4=new node(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        print(n1);
    }
}
