public class oops_constructor3 {
    public static void main(String[] args) {
        student s1=new student();
        s1.age=19;
        s1.name="sudarshan";
        student s2=new student(s1);
        System.out.println(s2.age);
        System.out.println(s2.name);
    }
}
class student{
    int age;
    String name;
    student(student s1){
        this.age=s1.age;
        this.name=s1.name;
    }
    student(){
    }
}
