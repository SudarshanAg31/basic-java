// Protected: The access level of a protected modifier is within the package and
// outside the package through child class. If you do not make the child class, it
// cannot be accessed from outside the package.
public class access_modifier_protected {
    public static void main(String[] args) {
    information in=new information();
        in.info("sudarshan");
        in.more_info();
    }
}
class information{
    protected String name;//name can access everywhere.within package 
    //if outside the package only by (sub class/child class)
    public void info(String name){
        this.name=name;
    }
    public void more_info(){
        System.out.println(name);
    }
}
