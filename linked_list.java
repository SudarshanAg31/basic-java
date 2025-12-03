import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> ld=new LinkedList<>();
        ld.add(1);//add value to linkedList
        ld.add(2);//add value to linkedList
        ld.add(3);//add value to linkedList
        ld.add(4);//add value to linkedList
        ld.add(5);//add value to linkedList

        System.out.println(ld);//print linkedList
        System.out.println(ld.get(1));//get value using index .
        System.out.println(ld.size());//get size of LinkedList
        System.out.println(ld.contains(4));//if it contain value so return true
        ld.addFirst(4);//at middle add value at index first
        ld.addLast(10);//at middle add value at last index
        System.out.println(ld);
        System.out.println(ld.getLast());//get last value
        System.out.println(ld.getFirst());//get first value
        System.out.println(ld.indexOf(4));//get index value using object
        System.out.println(ld.pollFirst());
        // System.out.println(ld.remove());
        System.out.println(ld);
        ld.remove();//it remove first element
        System.out.println(ld);
        ld.remove(1);//it remove base on index
        System.out.println(ld);
    }
}
