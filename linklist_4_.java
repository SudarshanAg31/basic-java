public class linklist_4_ {
    public static int print(node n1) {
        node temp=n1;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static class node{
        int data;
        node next;
        node(int data) {
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
        int size=print(n1);
        System.out.println(size);
    }   
}
