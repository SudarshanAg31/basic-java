// Constructor : Constructor is a special method which is invoked automatically at the time of object creation.
// It is used to initialize the data members of new objects generally. 

// 1)Constructors have the same name as class or structure. 
// 2)Constructors don’t have a return type. (Not even void)
// 3)Constructors are only called once, at object creation.

// There can be three types of constructors in Java. 
// 1. Non-Parameterized constructor : 

// If we don’t create one then it is created by default by Java.

class student{
    student() {
        System.out.println("student");
    }
}
public class oops_constuctor1 {
    public static void main(String[] args) {
        student s1=new student();
    }
}
