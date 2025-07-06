//if we want to access value of x so,we use getter function
public class _10_oops {
    public static void main(String[] args) {
        oops_student_3_ s1=new oops_student_3_();
        System.out.println(s1.getx());
        
        //but we can't access by by class name 
        //if we want to access by class name so, we add static to our function
        System.out.println(oops_student_3_.getx());
    }
}

