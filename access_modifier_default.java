//Default: The access level of a default modifier is only within the package. It
// cannot be accessed from outside the package. If you do not specify any access
// level, it will be the default.
public class access_modifier_default {
public static void main(String[] args) {
    information in=new information();
        in.info("sudarshan");
        in.more_info();
    }
}
class information{
    String name;//name can access everywhere. within the package
    public void info(String name){
        this.name=name;
    }
    public void more_info(){
        System.out.println(name);
    }
}