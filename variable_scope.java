public class variable_scope {
    static int x;//it is use to define global variable
    public static void main(String[] args) {
        x=13;//it behave as a global variable
        System.out.println(x);//13 global
        int x=16;//it behave as a local variable
        System.out.println(x);//16 local
        fun();
    }
    public static void fun(){
        System.out.println(x);//13 global
        int x=12;
        System.out.println(x);//12 local
    }
}
