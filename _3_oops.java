// classes are pass by refrence
public class _3_oops {
    public static class students{
        String name;
    }
    public static void fun(students s1) {
        s1.name="dhruv";
    }
    public static void main(String[] args) {
        students s1=new students();
        s1.name="sudarshan";
        System.out.println(s1.name);
        fun(s1);
        System.out.println(s1.name);
    }
}

