//static which is same for whole class
public class static_keyword {
    public static void main(String[] args) {
        student.School_name="kmps";//this is same for all student so we directly call by class name
        student s1= new student();
        s1.name="sudarshan";
        System.out.println(student.School_name);//by class name we class School_name
        System.out.println(s1.School_name);//by refrence varible we class the school_name
        System.out.println(s1.name);//we call non static varible
        student.change();//change the name of the school
        System.out.println(student.School_name);
        s1.change();//change the name of the school but not good practice
        System.out.println(student.School_name);
    }
}
class student{
    static String School_name;//same for all the student
    String name;//diff for student
        public static void change(){
            School_name="gla";
        }
}
