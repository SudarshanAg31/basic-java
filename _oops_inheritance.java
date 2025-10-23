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
        // Create a triangle object
        Triangle t1 = new Triangle(4);
        
        // Call subclass method
        t1.displayWeight();

        //call subclass method with parameter
        Triangle t2=new Triangle(1, 2, 3, 4);
        t2.display();
        
        // Call inherited method from parent class
        t1.color();

        // by this we can access the super class but can't access the base class.
        Shape s1=new Triangle(1, 2, 3, 4);
        System.out.println(s1.width);
        //System.out.println(s1.display());//show error
        //s1 is refrence type and triangle is object type

        //the compiler only allows you to access the members declared in Shape,
        //even though the actual object is a Triangle.

        //Because the compiler looks at the reference type, not the object type,
        // and Shape doesn’t have any method named display().
    }
}

// 🌸 Parent class (Base class / Superclass)
class Shape {
    int height;
    int length;
    int width;

    // Default constructor
    public Shape() {
        // This runs automatically if subclass doesn't call super(...)
    }

    // Parameterized constructors
    public Shape(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Shape(int height, int length) {
        this.height = height;
        this.length = length;
    }

    // Parent class method
    public void color() {
        System.out.println("Color: Pink");
    }
}

// 🔺 Child class (Derived class / Subclass)
class Triangle extends Shape {
    int weight;

    // Constructor 1 — uses parent's default constructor
    public Triangle(int weight) {
        this.weight = weight;
    }

    // Constructor 2 — uses parent's parameterized constructor
    public Triangle(int height, int length, int width, int weight) {
        super(height, length, width); // Call parent class constructor
        // used to initialize value present in parent class.
        this.weight = weight;
    }

    // Child class methods
    public void display() {
        System.out.println("Height: " + height + ", Length: " + length +
                           ", Width: " + width + ", Weight: " + weight);
    }

    public void displayWeight() {
        System.out.println("Weight: " + weight);
    }

    public void size() {
        System.out.println("Size of triangle: 5 cm");
    }
}
