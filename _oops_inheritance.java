// Inheritance is a process in which one object acquires all the properties and behaviors
// of its parent object automatically.
// In such a way, you can reuse, extend or modify the attributes and behaviors 
// which are defined in other classes. 
// In Java, the class which inherits the members of another class is called derived class 
// and the class whose members are inherited is called base class.
// The derived class is the specialized class for the base class. 

//this is single level inheritance
public class _oops_inheritance {
    public static void main(String[] args) {
        triangle t1=new triangle();
        t1.color();
        t1.size();
    }
}
class shape{
    public void color(){
        System.out.println("pink");
    }
}
class triangle extends shape{
    public void size(){
        System.out.println("size of triangle 5 cm");
    }
}
