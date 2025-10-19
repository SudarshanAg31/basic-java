//static which is same for whole class
public class static_keyword {
    public static void main(String[] args) {
        student.School_name="kmps";//this is same for all student so we directly call by class name
        student s1= new student();
        s1.name="sudarshan";
        System.out.println(student.School_name);//by class name we class School_name
        System.out.println(s1.School_name);//by reference variable we class the school_name
        System.out.println(s1.name);//we call non static variable
        student.change();//change the name of the school
        System.out.println(student.School_name);
        s1.change();//change the name of the school but not good practice
        System.out.println(student.School_name);

        human h1=new human(19, "sudarshan", 5.9f);
        //as the obj is created so static variable is update automatically without even calling
        human h2=new human(19, "dhruv", 5.9f);
        System.out.println(human.population);//2
        System.out.println(human.population);//2
// NOTE:static did't depend on object so if we comment h1 and h2 so still it work fine and print 0 0

        greeting();//inside a static method we can't use non-static method
    }
    static void fun(){
        greeting();//you can't use this because it requires an instance
        //but the function(fun) you are using it in does not depend on instances

        //you cannot access non static stuff without referencing their instance ina static context 
        //hance,here I am referencing it
        static_keyword obj =new static_keyword();
        obj.greeting();

    }
    void greeting(){
        fun();//in non-static we can call static method.
        System.out.println("hello everyone");
    }
}
class student{
    static String School_name;//same for all the student
    String name;//diff for student
        public static void change(){
            School_name="gla";
        }
}
class human{
    int age;
    String name;
    float height;
    static int population;
        public human(int age, String name, float height) {
        this.age = age;
        this.name = name;
        this.height = height;
        human.population +=1;
    }
}
