public class linklist_2_ {
    public static void print(node n1) {
        node temp=n1;
        while (temp!=null) { 
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
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
        n1.next=n2;
        n2.next=n3;
        //thisis the another way to print linklist
        // System.out.println(n1.data);
        // System.out.println(n1.next.data);
        // System.out.println(n1.next.next.data);
        //by using for loop
        node temp=n1;

        //with the help of for loop
        // for(int i=1;i<=3;i++){
        //     System.out.print(temp.data+" ");  
        //     temp=temp.next;
        // }

        //with the help of while loop
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
        
        //with the help of function
        print(n1);


    }
}
