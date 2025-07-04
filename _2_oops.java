//passing object to function
public class _2_oops {
    public static class students{
        String name;
        int age;
    }
    public static void fun(students s1) {
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
    public static void main(String[] args) {
        students s1=new students();
        s1.name="sudarshan";
        s1.age=19;
        fun(s1);
    }
}
