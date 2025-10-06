//if subclass inherent two super class then it is multiple inheritance
public class multiple_inherent {
    public static void main(String[] args) {
        horse h1= new horse();
        h1.eat();
        h1.rukna();
    }
}
interface animal{
    int eyes=2;
    void rukna();
}
interface herbivore{
    void eat();
}
class horse implements herbivore,animal{
    public void rukna(){
        System.out.println("horse chal ta hai");
    }
    public void eat(){
        System.out.println("horse kha ta hai");
    }
}