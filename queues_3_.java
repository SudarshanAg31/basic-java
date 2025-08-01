public class queues_3_ {
public static class queue{
    int[] arr=new int[100];
    int f=0;
    int l=0;
    public void push(int val) {
        arr[f]=val;
        f++;
    }
    public int pop() {
        int x=arr[l];
        l++;
        return x;
    }
    public int peek(){
        int x=arr[l];
        return x;
    }
    public int size(){
        return f-l;
    }
    public void print(){
        for(int i=l;i<f;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        queue st=new queue();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);  
        st.print();
        st.pop();
        st.print();
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
