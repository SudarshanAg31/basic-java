//interface is use to achieve full pure abstraction
//all the function present in animal class can be access by sub classes. 
public class _oops_interface_abstraction {
    public static void main(String[] args) {
        horse h1= new horse();
        h1.walks();
    }
}
interface animal{
    //by default every function and variable is consider as public
    //if we write or not ..
    void walks();// actually it is (public void walk();)
    //void speak();//so horse does not inherent speak() so it show error
}
class horse implements animal{
    //so if we try to access it in horse class so we want to make walk as public
    public void walks(){
        System.out.println("horse have 4 legs");
    }
}