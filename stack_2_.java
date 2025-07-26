//move from one stack to another
import java.util.Stack;
public class stack_2_ {
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
            int x=st.pop();
            st1.push(x);
        }
        //first it transfer from st to st1 in reverse order
        Stack<Integer> st2=new Stack<>();
        while(st1.size()!=0){
            int x=st1.pop();
            st2.push(x);
        }
        System.out.println(st);//due to this we move data from one stack to another 
        System.out.println(st2);//then it transfer from st1 to st2 so, 
        //now it is in same order  
    }
}
