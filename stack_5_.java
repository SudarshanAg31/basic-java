//change the order of the stack using recursion
import java.util.Stack;
public class stack_5_ {
    public static void pushAtBottom(Stack<Integer> st,int x) {
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    public static void print(Stack<Integer> st) {
        if(st.size()==1){
            return;
        }
        int top=st.pop();
        print(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        print(st);
        System.out.println(st);
    }
}
