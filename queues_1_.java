
import java.util.*;

public class queues_1_ {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);//to add element in queue
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();//to remove element in queue
        System.out.println(q);        
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());//to print topmost element in queue
        System.out.println(q.size());//to print the size of queue
    }
}
