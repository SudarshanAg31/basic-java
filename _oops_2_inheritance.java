//multilevel inheritance
public class _oops_2_inheritance {
    public static void main(String[] args) {
        loin l=new loin();
        l.loin_k();
        l.eat();
        l.walk();
    }
}
class animals{
    public void walk(){
    System.out.println( "walk");
}
}
class canviorous extends animals{
public void eat(){
    System.out.println("eat flesh");
}
}
class loin extends canviorous{
public void loin_k(){
    System.out.println("loin is the king of animals kingdom");
}
}