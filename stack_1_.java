
import java.util.Stack;

public class stack_1_ {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);//to push element in stack
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);//to print whole stack
        System.out.println(st.peek());//to print top most elememt
        st.pop();//it remove top most element
        System.out.println(st);
        System.out.println(st.size());//print the size of stack
        System.out.println(st.isEmpty());//it return true if it is empty else false
        //to access top most element 
        while(st.size()>1){//to remove every element to access the frist element
            st.pop();
        }
        System.out.println(st.peek());
    }
}
