//add element to the bottom of the stack
import java.util.Stack;

public class stack_3_ {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> st1=new Stack<>();
        while(st.size()!=0){
            st1.push(st.pop());
        }
        st.push(10);
        while(st1.size()!=0){
            st.push(st1.pop());
        }
        System.out.println(st);
    }
}
