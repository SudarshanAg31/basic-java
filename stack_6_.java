//implementation of stack using array
public class stack_6_ {
    public static class Stack{
        private int[] arr=new int[10];
        private int idx=0;
    
    void push(int val){
        if(isfull()==true){
            System.out.println("stack is full");
            return;
        }
        arr[idx]=val;
        idx++;
    }
    int peek(){
        if(idx==0){
        System.out.println("stack is empty");
        return -1;
    }else{
        return arr[idx-1];
    }
    }
    int pop(){
        if(idx==0){
        System.out.println("stack is empty");
            return -1;
        }
        else{
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
    }
    void display(){
        if(size()==0){
            System.out.println("[]");
            return;
        }
        for(int i=0;i<=idx-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int size(){
        return idx; 
    }

    boolean isempty(){
        if(idx==0) return true;
        else return false;
    }
    boolean isfull(){
        if(idx==arr.length){
            System.out.println("it is full");
            return true;
        }
        else return false;
    }
}
    public static void main(String[] args) {
        Stack st =new Stack();
        st.push(1);
        st.display();
        st.push(2);
        System.out.println(st.size());
        st.push(3);
        st.display();
        st.push(4);
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());

    }
}