import java.util.Stack;
public class stack_4_ {
    public static void print(Stack<Integer> st) {
        if(st.size()==0){
            return;
        }
        int x=st.pop();
        print(st);
        System.out.print(x+" ");
        st.push(x); 
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
        //this is the way to print the stack using array
        // int x=st.size();
        // int[] arr=new int[x];
        // for(int i=arr.length-1;i>=0;i--){
        //     arr[i]=st.pop(); 
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }
        // System.out.println();
        // System.out.println(st);
    }
}
