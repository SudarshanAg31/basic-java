
import java.util.*;

public class queues_2_ {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Queue<Integer>qu=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(q.size()!=0){
            qu.add(q.peek());
            q.remove();
        }
        System.out.println(qu);
        

    }
}
