public class oops_student_3_ {
    int age;
    int rol;
    String name;
    static int no_of_student;
    private static int x=20;
    public oops_student_3_(){

    }
    public oops_student_3_(int age,int rol,String name){
        this.age=age;
        this.rol=rol;
        this.name=name;
        no_of_student++;
        x++;
    }
    public static int getx(){
        return x;
    }
}


