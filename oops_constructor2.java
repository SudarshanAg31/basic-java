//Parameterized constructor :
public class oops_constructor2 {
    public static void main(String[] args) {
        Student s1=new Student(11, "sudarshan");
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
class Student{
    int age;
    String name;
    Student(int age,String name){
        this.age=age;
        this.name=name;
    }
}
