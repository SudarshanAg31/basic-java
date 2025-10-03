// Polymorphism is the ability to present the same interface for differing
// underlying forms (data types). With polymorphism, each of these classes
// will have different underlying data. Precisely, Poly means ‘many’ and
// morphism means ‘forms’.
public class _oops_polymorphism {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.info(15);
    }
}
class Student{

    public Student() {
    }
    
    public void info(){
        System.out.println("no information");
    }
    public void info(int age){
        System.out.println("age :"+ age);
    }
    public void info(int age,String name){
        System.out.println("age :"+ age);
        System.out.println("name :"+ name);
    }
    public void info(String name){
        System.out.println("name :"+ name);
    }
}
