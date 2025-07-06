//by constructor we can reduce no of line of code 
//it is not imp to define every element in class
//we can change normaly as previously

public class _7_oops {
    public static void main(String[] args) {
        //if we define constructor so we need to pass argument
        oops_student_2_ s1=new oops_student_2_(21,"sudarshan agrawal",91.00);
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.percent);

        //if we define empty constuctor so we not need to pass value
         oops_student_2_ s2=new oops_student_2_();
         s2.age=19;
         s2.name="sudarshan";
         s2.percent=91.11;
        System.out.println(s2.age);
        System.out.println(s2.name);
        System.out.println(s2.percent);
    }
}
