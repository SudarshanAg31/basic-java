
import javax.xml.transform.Source;

public class aa {
    public static class node{
        int val;
        node next;
        public node(int val) {
        this.val=val;
        }
    }
    public static void main(String[] args) {
        node n1=new node(10);
        node n2=new node(11);
        node n3=new node(12);
        node n4=new node(13);
        node n5=new node(14);
        node n6=new node(15);


        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;


        node p1=new node(1);
        node p2=new node(2);
        node p3=new node(3);
        node p4=new node(4);
        node p5=new node(5);
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        node head=n1;
        node temp=n1;
        node temp1=p1;
        while(p1!=null){
            n1=n1.next;
            p1=p1.next;
            temp.next=temp1;
            temp1.next=n1;
            temp=n1;
            temp1=p1;
        }
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
//     while(n1!=null){
//         System.out.print(n1.val+" ");
//         n1=n1.next;
//     }
// System.out.println();

//     while(p1!=null){
//         System.out.print(p1.val+" ");
//         p1=p1.next;
//     }
    }
}
