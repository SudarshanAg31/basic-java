// Public: The access level of a public modifier is everywhere. It can be accessed
// from within the class, outside the class, within the package and outside the package.

public class access_modifier_public {
    public static void main(String[] args) {
        information in=new information();
        in.info("sudarshan");
        in.more_info();
    }
}
class information{
    public String name;//name can access everywhere.
    public void info(String name){
        this.name=name;
    }
    public void more_info(){
        System.out.println(name);
    }
}
