public class _1_oops {
    //creation of new data type students which store (name,roll no.,percantage)
    public static class students{
        String name;
        int rn;
        double per;
    }
    public static void main(String[] args) {
        students s1=new students();//create data for new student s1
        //to provide data so we use student name and .datatype 
        s1.name="Sudarshan Agrawal";
        s1.per=83.33;
        s1.rn=61;
        //to access data we write student name and datatype
        System.out.println(s1.name);
        System.out.println(s1.per);
        System.out.println(s1.rn);
    }
}
