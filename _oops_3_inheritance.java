//herarchical inheritance
public class _oops_3_inheritance {
    public static void main(String[] args) {
        cat c= new cat();
        loin l=new loin();
        c.eat();
        l.loin_k();
    }
}
class animals{
    public void walk(){
    System.out.println( "walk");
}
}
class cat extends animals{
public void eat(){
    System.out.println("cat drink milk");
}
}
class loin extends animals{
public void loin_k(){
    System.out.println("loin is the king of animals kingdom");
}
}