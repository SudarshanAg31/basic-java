public class linklist_1_ {
    public static class node{
        int data;//value
        node next;//address (link) to the next node
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        //pass data into the node 
        node n1=new node(5);
        node n2=new node(6);
        node n3=new node(7);
        node n4=new node(8);
        node n5=new node(9);
        //pass address to the node
        n1.next=n2;// 5-> 6 7 8 9    
        n2.next=n3;// 5-> 6-> 7 8 9      
        n3.next=n4;// 5-> 6-> 7-> 8 9      
        n4.next=n5;// 5-> 6-> 7-> 8-> 9      
        //check that node is link or not
        System.out.println(n1.next);
        System.out.println(n2.next);
        System.out.println(n3.next);
        System.out.println(n4.next);
        System.out.println(n5.next);//it will be null bcz at node 5 address of new element is not added
        //check address of same node
        System.out.println(n1);//(mtlb jub bhi mujhe same element ka address dhek n ho to ye print ker n hai)
        //print element
        System.out.println(n1.data);
        System.out.println(n2.data);
        System.out.println(n3.data);
        System.out.println(n4.data);
        System.out.println(n5.data);

    }
}
