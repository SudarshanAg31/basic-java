//implementation of stack using linked list
public class stack_7_ {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static class Stack{
        node head=null;
        int size=0;

        void push(int val){
        node temp=new node(val);
        temp.next=head;
        head=temp;
        size++;    
        }
        int pop(){
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("empty");
                return -1;
            }
            return head.val;
        }
        int Size(){
            return size;
        }
        void revdisplay(){
            node temp=head;
            if(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void recdisplay(node h1){
            if(h1==null)return;
            recdisplay(h1.next);
            System.out.print(h1.val+" ");
        }
        void display(){//this is my helper function use because
            recdisplay(head);//if we direct pass head so it change ,now we use function to do so
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st =new Stack();
        st.push(1);
        st.display();
        st.push(2);
        System.out.println(st.Size());
        st.push(3);
        st.display();
        st.push(4);
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.Size());

    }
}
