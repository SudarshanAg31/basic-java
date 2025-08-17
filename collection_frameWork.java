
import java.util.*;
public class collection_frameWork {
    public static class map{
        public void maps() {
            Map<Integer,String>m=new HashMap<>();
            m.put(1, "sudarshan");
            m.put(2, "tanvi");    
            m.put(3, "love");  
            m.put(3, "dhruv"); //over write   
            System.out.println(m);
            System.out.println(m.get(2));
            System.out.println(m.containsKey(4));
            System.out.println(m.containsValue("sudarshan"));
            System.out.println(m.keySet());
            System.out.println(m.values());
        }
    }
    public static class set{
        public void hashset() {
            //unordered
            HashSet<Integer>hs=new HashSet<>();
            hs.add(1);
            hs.add(1);
            hs.add(2);
            hs.add(3);
            hs.add(3);
            System.out.println(hs);
            hs.remove(2);
            System.out.println(hs.contains(2));
            System.out.println(hs.size());
        }
        public void linkhashset() {
            //ordered
            LinkedHashSet<Integer>hs=new LinkedHashSet<>();
            hs.add(1);
            hs.add(1);
            hs.add(2);
            hs.add(3);
            hs.add(3);
            System.out.println(hs);
            hs.remove(2);
            System.out.println(hs.contains(2));
            System.out.println(hs.size());
        }
        public void treehashsetsort() {
            //ordered
            TreeSet<Integer>hs=new TreeSet<>();
            hs.add(3);
            hs.add(3);
            hs.add(1);
            hs.add(1);
            hs.add(2);
            System.out.println(hs);
            hs.remove(2);
            System.out.println(hs.contains(2));
            System.out.println(hs.size());
        }
    }
    public static class queue{
        public void queues() {  
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.get(0));
        q.set(1, 10);
        System.out.println(q);
        System.out.println(q.contains(10));
        } 
        public void priority() {
            //it give priority to min number
            PriorityQueue<Integer> pq=new PriorityQueue<>();//it is min prt
            pq.add(10);
            pq.add(1);
            pq.add(120);
            System.out.println(pq.peek());
            System.out.println(pq.remove());
            System.out.println(pq);
        }       
        public void prioritymax() {
            //it give priority to max number
            PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//it is max prt
            pq.add(10);
            pq.add(1);
            pq.add(120);
            System.out.println(pq.peek());
            System.out.println(pq.remove());
            System.out.println(pq);
        }  
        public void queuedeq() {
            Deque<Integer> pq=new ArrayDeque<>();
            pq.addFirst(10);
            pq.addLast(1);
            pq.add(120);
            System.out.println(pq.peekLast());
            System.out.println(pq.removeLast());
            System.out.println(pq);
        }       
    }
    public static class list{
        public void array() {  
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);
        System.out.println(arr.get(0));
        arr.set(1, 10);
        System.out.println(arr);
        System.out.println(arr.contains(10));
        }
        public void linkedlist() {  
        LinkedList<Integer> link=new LinkedList<>();
        link.add(1);
        link.add(2);
        link.add(3);
        System.out.println(link);
        System.out.println(link.get(0));
        link.set(1, 10);
        System.out.println(link);
        System.out.println(link.contains(10));
        }
        public void stack() {  
        Stack<Integer> st=new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        System.out.println(st.get(0));
        st.set(1, 10);
        System.out.println(st);
        System.out.println(st.contains(10));
        }
    }

    public static void main(String[] args) {
        map m=new map();
        set st=new set();
        list l=new list();
        queue q=new queue();
        l.array();
        System.out.println();
        l.linkedlist();
        System.out.println();
        l.stack();
        System.out.println();
        q.queues();
        System.out.println();
        q.priority();
        System.out.println();
        q.queuedeq();
        System.out.println();
        st.hashset();
        System.out.println();
        m.maps();
    }
}
