
import java.util.ArrayList;

public class wrapper_classes_and_Array_List {
    public static void main(String[] args) {
        Integer x=Integer.valueOf(3);
        System.out.println(x);
        Float f=Float.valueOf(3.14f);
        System.out.println(f);

        ArrayList<Integer>l1=new ArrayList<>();//decelear for Integer
        ArrayList<Boolean>l2=new ArrayList<>();//for Boolean
        ArrayList<Float>l3=new ArrayList<>();//for Float 

        //add new element
        l1.add(1);//[1]
        l1.add(5);//[1,5]
        l1.add(4);//[1,5,4]
        l1.add(3);//[1,5,4,3]
        l1.add(2);//[1,5,4,3,2]
  
        //get an element at index i
        System.out.println(l1.get(1));// print element at index 1
  
        //print with for loop
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));//print each element
        }

        //printing the array list directly
        System.out.println(l1);//print whole list like [1,5,4,3,2]

        //add element at some index i
        l1.add(1,200);//add element at index 1 which is 200 
        System.out.println(l1);//[1,200,5,4,4,2]
        
        //modifying element at index i
        l1.set(1,10);//change 200 with 10
        System.out.println(l1);//[1,10,5,4,3,2]

        //removing element at index i
        l1.remove(1);//only index is pass
        System.out.println(l1);//[1,5,4,3,2]

        //remove element e
        l1.remove(Integer.valueOf(15));//if value exist so it remove else no changes 

        //checking if element is exist
        boolean ans=l1.contains(Integer.valueOf(17));
        System.out.println(ans);

        //if you don't specify class,you can put anything inside l
        ArrayList l=new ArrayList();
        l.add(5);
        l.add("s");
        l.add(true);
        l.add("sudarshan");
        l.add(5.12);
        System.out.println(l); 
    } 
}
