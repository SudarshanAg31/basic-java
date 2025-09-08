import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer>st=new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(4);
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.contains(4));
        st.remove(4);
        System.out.println(st);

    }
}
