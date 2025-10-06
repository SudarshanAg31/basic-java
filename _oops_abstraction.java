// Abstraction is the process of hiding the implementation details and showing only
// the essential features of a class or object.
// It helps in focusing on what an object does, not how it does it.
// In Java, abstraction is achieved using:
// Abstract classes
// Interfaces
public class _oops_abstraction {
    public static void main(String[] args) {
        horse h1= new horse();
        h1.walk();
        h1.eat();
//imp: always super class constructor is all then subclass constructor is call
    }
}
abstract class animals{

    animals() {
        System.out.println("you are create an new animal");
    }
    
    abstract void walk();
    void eat(){
        System.out.println("animal eat");
    }
}
class horse extends animals{

    horse() {
        System.out.println("created a horse");
    }
    
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends animals{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}