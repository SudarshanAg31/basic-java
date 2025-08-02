
import java.util.Stack;

public class try1 {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        int[] arr={5,2,4,6,3,5};
        st.push(arr[0]);
        int[] ans=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            if(st.size()!=0&&arr[st.peek()]<arr[i]){
                if(arr[st.peek()]>arr[i]){
                    st.pop();
                }
                ans[i]=arr[st.peek()];
            }
            st.push(i);
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
