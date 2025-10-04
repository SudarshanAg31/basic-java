// Private: The access level of a private modifier is only within the class. It cannot
// be accessed from outside the class.
public class access_modifier_private {
    public static void main(String[] args) {
    information in=new information();
        in.setName("sudarshan");
        System.out.println(in.getName());
    }
}
class information{
    private String name;//name can access with in a class everywhere.within package 
    //if outside the package only by (sub class/child class)
    //so for access the private varible we use getters and setters methods
    private int num;
    public String getName() {
        num+=1;
        read(num);
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //if we take another method (read) but now it is private so,
    //in this case i only want to use(read)method that .how many time the data is read.
    //but usser can't access (read) method
    private void read(int num) {
        this.num = num;
    }
}
